package lk.ijse.studentmanagementsystem.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SubjectDTO {
    private String id;
    private String name;
    private String description;
    private List<CourseDTO> courses;
}
