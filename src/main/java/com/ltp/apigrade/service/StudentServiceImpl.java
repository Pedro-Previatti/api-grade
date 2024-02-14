package com.ltp.apigrade.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.ltp.apigrade.entity.Course;
import com.ltp.apigrade.entity.Student;
import com.ltp.apigrade.exception.StudentNotFoundException;
import com.ltp.apigrade.repository.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    @Override
    public Student getStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return unwrapStudent(student, id);
    }
    
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    
    @Override
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
    
    @Override
    public List<Student> getStudents() {
        return (List<Student>)studentRepository.findAll();
    }

    public Set<Course> getEnrolledStudents(Long id) {
        Student student = getStudent(id);
        return student.getCourses();
    }

    static Student unwrapStudent(Optional<Student> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new StudentNotFoundException(id);
    }
}
