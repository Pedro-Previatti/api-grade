package com.ltp.apigrade;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ltp.apigrade.entity.Course;
import com.ltp.apigrade.repository.CourseRepository;
import com.ltp.apigrade.service.CourseService;

@RunWith(MockitoJUnitRunner.class)
public class CourseServiceTest {
    
    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseService courseService;

    @Test
    public void getCoursesFromRepoTest() {
        when(courseRepository.findAll()).thenReturn(Arrays.asList(
            new Course("Charms", "CH104", "In this class, you will learn spells concerned with giving an object new and unexpected properties."),
            new Course("Defence Against the Dark Arts", "DADA", "In this class, you will learn defensive techniques against the dark arts.")
        ));

        courseService.getCourses();

        List<Course> result = courseService.getCourses();

        assertEquals("Charms", result.get(0).getSubject());
        assertEquals("Defence Against the Dark Arts", result.get(1).getSubject());
    }
}
