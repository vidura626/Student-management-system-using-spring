package lk.ijse.studentmanagementsystem.service;

import lk.ijse.studentmanagementsystem.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    String saveStudent(StudentDTO student);
    String updateStudent(StudentDTO student);
    String deleteStudent(String id);
    List<StudentDTO> getAllStudent();
    String getNextStudentId();
    StudentDTO searchStudent(String id);
}
