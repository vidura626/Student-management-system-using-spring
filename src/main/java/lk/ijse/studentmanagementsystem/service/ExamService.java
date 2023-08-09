package lk.ijse.studentmanagementsystem.service;

import lk.ijse.studentmanagementsystem.dto.ExamDTO;

import java.util.List;

public interface ExamService {
    String saveExam(ExamDTO exam);
    String updateExam(ExamDTO exam);
    String deleteExam(String id);
    List<ExamDTO> getAllExam();
    String getNextExamId();
    ExamDTO searchExam(String id);
}
