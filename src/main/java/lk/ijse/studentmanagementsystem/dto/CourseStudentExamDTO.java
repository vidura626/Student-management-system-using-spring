package lk.ijse.studentmanagementsystem.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CourseStudentExamDTO {
    private String id;
    private Date date;
    private int mark;
    private CourseStudentDTO courseStudentId;
    private ExamDTO examId;

}
