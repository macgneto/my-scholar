package com.example.myscholar.bootstrap;

import com.example.myscholar.domain.Course;
import com.example.myscholar.domain.Student;
import com.example.myscholar.repositories.CourseRepository;
import com.example.myscholar.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public BootStrapData(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student jimakos = new Student("Dimitrios", "Roussis", "macgneto@gmail.com", "6986284984");
        Course pls = new Course("test", "test", "test", "2022");
        jimakos.getCourses().add(pls);
        pls.getStudents().add(jimakos);

        studentRepository.save(jimakos);
        courseRepository.save(pls);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Students: " + studentRepository.count());
        System.out.println("Number of Courses: " + courseRepository.count());


    }
}
