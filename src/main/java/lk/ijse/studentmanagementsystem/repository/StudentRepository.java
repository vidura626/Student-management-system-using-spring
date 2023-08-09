package lk.ijse.studentmanagementsystem.repository;

import lk.ijse.studentmanagementsystem.entity.Student;
import lk.ijse.studentmanagementsystem.entity.embeded.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

public interface StudentRepository extends JpaRepository<Student, String> {
    @Modifying
    @Query("update Student s set s.birthday = :birthday,s.email = :email," +
            "s.gender = :gender, s.name = :name, s.username = :username," +
            "s.password = :password, s.proPic = :proPic where s.id = :id")
    void updateStudent(@Param(value = "birthday") Date birthday, @Param(value = "email") String email,
                       @Param(value = "gender") String gender, @Param(value = "name") Name name,
                       @Param(value = "username") String username, @Param(value = "password")
                               String password, @Param(value = "proPic") String proPic,
                       @Param(value = "id") String id);
}
