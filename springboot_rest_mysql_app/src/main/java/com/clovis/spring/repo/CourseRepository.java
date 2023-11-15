package com.clovis.spring.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.clovis.spring.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
//essa interface serve para extender propriedades do JpaRepository