package com.ltp.apigrade.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ltp.apigrade.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
    
    @Override
    public Course getCourse(Long id) {
        return null;
    }
    
    @Override
    public Course savCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
    }

    @Override
    public List<Course> getCourses() {
        return null;
    }
}
