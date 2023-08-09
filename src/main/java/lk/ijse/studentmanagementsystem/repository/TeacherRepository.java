package lk.ijse.studentmanagementsystem.repository;

import lk.ijse.studentmanagementsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
}
