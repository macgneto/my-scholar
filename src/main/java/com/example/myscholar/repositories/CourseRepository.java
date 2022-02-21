package com.example.myscholar.repositories;

import com.example.myscholar.domain.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
