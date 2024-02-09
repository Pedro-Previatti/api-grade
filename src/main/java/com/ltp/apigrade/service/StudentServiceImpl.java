package com.ltp.apigrade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.apigrade.entity.Student;
import com.ltp.apigrade.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    StudentRepository repository;

    @Override
    public Student getStudent(Long id) {
        return repository.findById(id).get();
    }
    
    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }
    
    @Override
    public void deleteStudent(Long id){
        repository.deleteById(id);
    }
    
    @Override
    public List<Student> getStudents() {
        return (List<Student>)repository.findAll();
    }
}
