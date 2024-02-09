package com.ltp.apigrade.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.apigrade.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}