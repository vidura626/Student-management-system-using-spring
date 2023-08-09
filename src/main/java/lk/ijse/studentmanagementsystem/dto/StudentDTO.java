package lk.ijse.studentmanagementsystem.dto;

import lk.ijse.studentmanagementsystem.dto.embeded.AddressDTO;
import lk.ijse.studentmanagementsystem.dto.embeded.ContactDTO;
import lk.ijse.studentmanagementsystem.dto.embeded.NameDTO;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentDTO {
    private String id;
    private NameDTO name;
    List<AddressDTO> addresses;
    List<ContactDTO> contacts;
    private String gender;
    private Date joinedDate;
    private Date birthday;
    private String email;
    private String username;
    private String password;
    private String proPic;
    private List<CourseStudentDTO> courses;
}
