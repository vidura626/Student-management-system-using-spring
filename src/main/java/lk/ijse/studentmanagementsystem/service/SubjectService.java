package lk.ijse.studentmanagementsystem.service;

import lk.ijse.studentmanagementsystem.dto.SubjectDTO;

import java.util.List;

public interface SubjectService {
    String saveSubject(SubjectDTO subject);
    String updateSubject(SubjectDTO subject);
    String deleteSubject(String id);
    List<SubjectDTO> getAllSubject();
    String getNextSubjectId();
    SubjectDTO searchSubject(String id);
}
