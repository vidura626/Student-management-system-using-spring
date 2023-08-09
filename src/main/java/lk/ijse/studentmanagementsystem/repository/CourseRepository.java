package lk.ijse.studentmanagementsystem.repository;

import lk.ijse.studentmanagementsystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
