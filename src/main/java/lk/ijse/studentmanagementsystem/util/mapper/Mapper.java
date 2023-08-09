package lk.ijse.studentmanagementsystem.util.mapper;

import lk.ijse.studentmanagementsystem.dto.*;
import lk.ijse.studentmanagementsystem.dto.embeded.AddressDTO;
import lk.ijse.studentmanagementsystem.dto.embeded.NameDTO;
import lk.ijse.studentmanagementsystem.entity.*;
import lk.ijse.studentmanagementsystem.entity.embeded.Address;
import lk.ijse.studentmanagementsystem.entity.embeded.Name;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    Student toStudent(StudentDTO studentDTO);
    StudentDTO toStudentDTO(Student student);
    Address toAddress(AddressDTO addressDTO);
    AddressDTO toAddressDTO(Address address);
    Name toName(NameDTO nameDTO);
    NameDTO toNameDTO(Name name);
    Admin toAdmin(AdminDTO adminDTO);
    AdminDTO toAdminDTO(Admin admin);
    Course toCourse(CourseDTO courseDTO);
    CourseDTO toCourseDTO(Course course);
    CourseStudent toCourseStudent(CourseDTO courseDTO);
    CourseDTO toCourseStudentDTO(CourseStudent courseStudent);
    CourseStudentExam toCourseStudentExam(CourseStudentExamDTO courseStudentExamDTO);
    CourseStudentExamDTO toCourseStudentExamDTO(CourseStudentExam courseStudentExam);
    CourseTeacher toCourseTeacher(CourseDTO courseDTO);
    CourseDTO toCourseTeacherDTO(CourseTeacher courseTeacher);
    Exam toExam(ExamDTO examDTO);
    ExamDTO toExamDTO(Exam exam);
    Subject toSubject(SubjectDTO subjectDTO);
    SubjectDTO toSubjectDTO(Subject subject);
    Teacher toTeacher(TeacherDTO teacherDTO);
    TeacherDTO toTeacherDTO(Teacher teacher);
}
