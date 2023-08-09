package lk.ijse.studentmanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
public class Exam {
    @Id
    String id;
    String name;
    String description;

    @ManyToOne
    private Course courseId;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "examId", targetEntity = CourseStudentExam.class)
    private List<CourseStudentExam> studentExamList;
}
