package lk.ijse.studentmanagementsystem.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CourseStudentDTO {
    private String id;
    private StudentDTO studentId;
    private CourseDTO courseId;
    private List<CourseStudentExamDTO> exams;

}
