package com.ltp.apigrade.service;

import java.util.List;

import com.ltp.apigrade.entity.Course;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
}
