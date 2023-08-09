package lk.ijse.studentmanagementsystem.entity;

import lk.ijse.studentmanagementsystem.entity.embeded.Address;
import lk.ijse.studentmanagementsystem.entity.embeded.Contact;
import lk.ijse.studentmanagementsystem.entity.embeded.Name;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    @Id
    private String id;

    @Embedded
    private Name name;

    @Embedded
    private Address address;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ElementCollection()
    @CollectionTable(
            name = "studentContacts",
            joinColumns = @JoinColumn(name = "studentId")
    )
    List<Contact> contacts;
    private String gender;
    @CreationTimestamp
    private Date joinedDate;
    private Date birthday;
    private String email;
    private String username;
    private String password;
    private String proPic;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "studentId", targetEntity = CourseStudent.class)
    private List<CourseStudent> courses;
}
