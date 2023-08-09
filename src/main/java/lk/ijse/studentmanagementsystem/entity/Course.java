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
public class Course {
    @Id
    String id;
    String name;
    String description;
    String image;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "courseId", targetEntity = CourseStudent.class)
    private List<CourseStudent> students;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "course", targetEntity = CourseTeacher.class)
    private List<CourseTeacher> teachers;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "courseId", targetEntity = Exam.class)
    private List<Exam> exams;

    @ManyToOne
    private Admin adminId;

    @ManyToOne
    private Subject subjectId;
}
