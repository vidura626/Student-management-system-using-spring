package lk.ijse.studentmanagementsystem.entity;

import lombok.*;

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
public class CourseStudentExam {
    @Id
    private String id;
    private Date date;
    private int mark;
    @ManyToOne
    private CourseStudent courseStudentId;
    @ManyToOne
    private Exam examId;

}
