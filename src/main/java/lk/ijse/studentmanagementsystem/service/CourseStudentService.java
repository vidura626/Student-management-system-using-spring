package lk.ijse.studentmanagementsystem.service;


import lk.ijse.studentmanagementsystem.dto.CourseStudentDTO;

import java.util.List;

public interface CourseStudentService {
    String saveCourseStudent(CourseStudentDTO courseStudent);
    String updateCourseStudent(CourseStudentDTO courseStudent);
    String deleteCourseStudent(String id);
    List<CourseStudentDTO> getAllCourseStudent();
    String getNextCourseStudentId();
    CourseStudentDTO searchCourseStudent(String id);
}
