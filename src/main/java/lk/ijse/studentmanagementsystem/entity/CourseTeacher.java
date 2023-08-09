package lk.ijse.studentmanagementsystem.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CourseTeacher {
    @Id
    private String id;
    @CreationTimestamp
    private Date publishedDate;
    @ManyToOne
    private Teacher teacher;
    @ManyToOne
    private Course course;
}
