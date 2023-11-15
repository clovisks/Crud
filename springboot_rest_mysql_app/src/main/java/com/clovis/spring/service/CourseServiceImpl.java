package com.clovis.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clovis.spring.binding.Course;
import com.clovis.spring.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired //novamente usando a implementação provida do JpaRepository
	private CourseRepository courseRepo;
	
	@Override
	public String upsert(Course course) {
		
		courseRepo.save(course); //faz o update dos dados da tabela
		
		return "success";
	}

	//método para buscar curso por course_id na tabela
	@Override
	public Course getById(Integer cid) {
		
		Optional<Course> findById = courseRepo.findById(cid);
		
		if(findById.isPresent()) { //checa se o Id está presente na tabela e retorna se sim
			return findById.get();
		}
		
		return null;
	}

	//método para buscar todos os cursos da tabela
	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	//método de deletar curso da tabela
	@Override
	public String deletedById(Integer cid) {
		if(courseRepo.existsById(cid)) { //checa se o Id existe e somente se sim o deleta, caso contrario retorna que nao o encontrou
			courseRepo.deleteById(cid);
			return "Delete Success";
		}else {
			return "No Record Found";
		}	
	}

}
