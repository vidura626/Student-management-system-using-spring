package lk.ijse.studentmanagementsystem.repository;


import lk.ijse.studentmanagementsystem.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, String> {
}
