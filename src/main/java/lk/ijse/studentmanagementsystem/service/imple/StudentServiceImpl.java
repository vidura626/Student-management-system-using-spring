package lk.ijse.studentmanagementsystem.service.imple;


import lk.ijse.studentmanagementsystem.dto.StudentDTO;
import lk.ijse.studentmanagementsystem.repository.StudentRepository;
import lk.ijse.studentmanagementsystem.service.StudentService;
import lk.ijse.studentmanagementsystem.util.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private Mapper mapper;
    private StudentRepository repository;

    @Autowired
    StudentServiceImpl(Mapper mapper, StudentRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    @Override
    public String saveStudent(StudentDTO student) {
        repository.save(mapper.toStudent(student));
        return student.getId();
    }

    @Override
    public String updateStudent(StudentDTO student) {
        java.util.Date bdy = student.getBirthday();
        repository.updateStudent(
                new Date(bdy.getYear(), bdy.getMonth(), bdy.getDay()),
                student.getEmail(),
                student.getGender(),
                mapper.toName(student.getName()),
                student.getUsername(),
                student.getPassword(),
                student.getProPic(),
                student.getId()
        );
        return student.getId();
    }

    @Override
    public String deleteStudent(String id) {
        repository.delete(repository.findById(id).get());
        return repository.findById(id).get().getId();
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        return repository.findAll().stream().map(mapper::toStudentDTO).collect(Collectors.toList());
    }

    @Override
    public String getNextStudentId() {
        if (getAllStudent().size() > 0) {
            String id = getAllStudent().get(getAllStudent().size() - 1).getId();
            int newId = Integer.parseInt(id.replace("S", "")) + 1;
            return String.format("S%04d", newId);
        }
        return "S0001";
    }

    @Override
    public StudentDTO searchStudent(String id) {
        return mapper.toStudentDTO(repository.findById(id).get());
    }
}
