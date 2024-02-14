package com.ltp.apigrade.service;

import java.util.List;
import java.util.Set;

import com.ltp.apigrade.entity.Course;
import com.ltp.apigrade.entity.Student;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
    Course addStudentToCourse(Long studentId, Long courseId);
    Set<Student> getEnrolledStudents(Long id);
}
