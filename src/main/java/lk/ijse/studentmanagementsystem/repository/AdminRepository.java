package lk.ijse.studentmanagementsystem.repository;

import lk.ijse.studentmanagementsystem.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String> {
}
