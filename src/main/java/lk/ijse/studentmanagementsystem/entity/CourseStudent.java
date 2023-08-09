package lk.ijse.studentmanagementsystem.entity;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CourseStudent {
    @Id
    private String id;
    @ManyToOne
    private Student studentId;
    @ManyToOne
    private Course courseId;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "courseStudentId", targetEntity = CourseStudentExam.class)
    private List<CourseStudentExam> exams;

}
