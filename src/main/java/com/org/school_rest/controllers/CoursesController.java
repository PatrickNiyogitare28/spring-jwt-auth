package com.org.school_rest.controllers;

import com.org.school_rest.models.Course;
import com.org.school_rest.repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
    private CoursesRepository coursesRepository;

    @PostMapping("/api/courses")
    public Course saveCourse(Course course){
        return coursesRepository.save(course);
    }

    @GetMapping("/api/courses")
    public List<Course> getCourses(){
        return coursesRepository.findAll();
    }
}
