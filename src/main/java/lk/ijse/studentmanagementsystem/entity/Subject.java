package lk.ijse.studentmanagementsystem.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Subject {
    @Id
    private String id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "subjectId", targetEntity = Course.class, fetch = FetchType.EAGER)
    private List<Course> courses;
}
