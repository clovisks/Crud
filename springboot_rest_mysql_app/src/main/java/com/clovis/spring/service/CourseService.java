package com.clovis.spring.service;

import java.util.List;
import com.clovis.spring.binding.Course;

public interface CourseService {
	
	public String upsert(Course course); //método de inserção

	public Course getById(Integer cid); //método para buscar curso específico
	
	public List<Course> getAllCourses(); //método para buscar todos os cursos da tabela
	
	public String deletedById(Integer cid); //método para deletar curso específico
	
}
