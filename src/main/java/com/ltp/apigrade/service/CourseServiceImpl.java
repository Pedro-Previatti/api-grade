package com.ltp.apigrade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ltp.apigrade.entity.Course;
import com.ltp.apigrade.exception.CourseNotFoundException;
import com.ltp.apigrade.repository.CourseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {
    
    CourseRepository repository;

    @Override
    public Course getCourse(Long id) {
        Optional<Course> course = repository.findById(id);
        return unwrapCourse(course, id);
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

    static Course unwrapCourse(Optional<Course> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new CourseNotFoundException(id);
    }
}
