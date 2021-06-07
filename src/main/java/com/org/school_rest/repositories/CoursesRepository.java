package com.org.school_rest.repositories;

import com.org.school_rest.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Course, Integer> {
}
