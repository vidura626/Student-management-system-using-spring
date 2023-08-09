package lk.ijse.studentmanagementsystem.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CourseDTO {
    String id;
    String name;
    String description;
    String image;
    private List<CourseStudentDTO> students;
    private List<CourseTeacherDTO> teachers;
    private List<ExamDTO> exams;
    private AdminDTO adminId;
    private SubjectDTO subjectId;
}
