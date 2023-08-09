package lk.ijse.studentmanagementsystem.service;

import lk.ijse.studentmanagementsystem.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    String saveCourse(CourseDTO admin);
    String updateCourse(CourseDTO admin);
    String deleteCourse(String id);
    List<CourseDTO> getAllCourse();
    String getNextCourseId();
    CourseDTO searchCourse(String id);
}
