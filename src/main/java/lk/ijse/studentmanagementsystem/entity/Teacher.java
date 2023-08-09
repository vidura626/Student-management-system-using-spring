package lk.ijse.studentmanagementsystem.entity;


import lk.ijse.studentmanagementsystem.entity.embeded.Address;
import lk.ijse.studentmanagementsystem.entity.embeded.Contact;
import lk.ijse.studentmanagementsystem.entity.embeded.Name;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Teacher {
    @Id
    private String id;

    @Embedded
    private Name name;

    @Embedded
    private Address address;

    @ElementCollection()
    @CollectionTable(
            name = "teacherContacts",
            joinColumns = @JoinColumn(name = "teacherId")
    )
    List<Contact> contacts;
    private String gender;
    private Date joinedDate;
    private Date birthday;
    private String email;
    private String username;
    private String password;
    private String proPic;

    @OneToMany(mappedBy = "teacher", targetEntity = CourseTeacher.class, fetch = FetchType.EAGER)
    private List<CourseTeacher> courses;
}
