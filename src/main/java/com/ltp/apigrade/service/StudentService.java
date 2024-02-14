package com.ltp.apigrade.service;

import java.util.List;
import java.util.Set;

import com.ltp.apigrade.entity.Course;
import com.ltp.apigrade.entity.Student;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    Set<Course> getEnrolledStudents(Long id);
}
