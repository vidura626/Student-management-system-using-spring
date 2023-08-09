package lk.ijse.studentmanagementsystem.service;

import lk.ijse.studentmanagementsystem.dto.CourseStudentExamDTO;

import java.util.List;

public interface CourseStudentExamService {
    String saveCourseStudentExam(CourseStudentExamDTO courseStdExam);
    String updateCourseStudentExam(CourseStudentExamDTO courseStdExam);
    String deleteCourseStudentExam(String id);
    List<CourseStudentExamDTO> getAllCourseStudentExam();
    String getNextCourseStudentExamId();
    CourseStudentExamDTO searchCourseStudentExam(String id);
}
