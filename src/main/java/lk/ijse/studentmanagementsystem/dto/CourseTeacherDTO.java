package lk.ijse.studentmanagementsystem.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CourseTeacherDTO {
    private String id;
    private Date publishedDate;
    private TeacherDTO teacher;
    private CourseDTO course;
}
