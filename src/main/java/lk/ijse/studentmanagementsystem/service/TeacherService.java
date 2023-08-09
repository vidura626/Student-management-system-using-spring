package lk.ijse.studentmanagementsystem.service;

import lk.ijse.studentmanagementsystem.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    String saveTeacher(TeacherDTO teacher);
    String updateTeacher(TeacherDTO teacher);
    String deleteTeacher(String id);
    List<TeacherDTO> getAllTeacher();
    String getNextTeacherId();
    TeacherDTO searchTeacher(String id);
}
