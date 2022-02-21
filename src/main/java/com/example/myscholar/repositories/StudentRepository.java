package com.example.myscholar.repositories;

import com.example.myscholar.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
