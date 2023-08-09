package lk.ijse.studentmanagementsystem.repository;

import lk.ijse.studentmanagementsystem.entity.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseStudentRepository extends JpaRepository<CourseStudent, String> {
}
