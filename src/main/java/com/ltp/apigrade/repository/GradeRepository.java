package com.ltp.apigrade.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.apigrade.entity.Grade;

public interface GradeRepository extends CrudRepository<Grade, Long> {
    Grade findByStudentIdAndCourseId(Long studentId, Long courseId);
}