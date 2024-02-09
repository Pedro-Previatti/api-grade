package com.ltp.apigrade.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.apigrade.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
}