package lk.ijse.studentmanagementsystem.service;


import lk.ijse.studentmanagementsystem.dto.CourseTeacherDTO;

import java.util.List;

public interface CourseTeacherService {
    String saveCourseTeacher(CourseTeacherDTO courseTeacher);
    String updateCourseTeacher(CourseTeacherDTO courseTeacher);
    String deleteCourseTeacher(String id);
    List<CourseTeacherDTO> getAllCourseTeacher();
    String getNextCourseTeacherId();
    CourseTeacherDTO searchCourseTeacher(String id);
}
