package com.ltp.apigrade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.apigrade.entity.Course;
import com.ltp.apigrade.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
    
    @Autowired
    CourseRepository repository;

    @Override
    public Course getCourse(Long id) {
        return repository.findById(id).get();
    }
    
    @Override
    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Course> getCourses() {
        return (List<Course>)repository.findAll();
    }
}
