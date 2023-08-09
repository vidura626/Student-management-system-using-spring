package lk.ijse.studentmanagementsystem.service;

import lk.ijse.studentmanagementsystem.dto.AdminDTO;

import java.util.List;

public interface AdminService {
    String saveAdmin(AdminDTO admin);
    String updateAdmin(AdminDTO admin);
    String deleteAdmin(String id);
    List<AdminDTO> getAllAdmin();
    String getNextAdminId();
    AdminDTO searchAdmin(String id);
}
