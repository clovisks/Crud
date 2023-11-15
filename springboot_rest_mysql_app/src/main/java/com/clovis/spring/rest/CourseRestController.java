package com.clovis.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clovis.spring.binding.Course;
import com.clovis.spring.service.CourseService;

@RestController //implementando a interface dentro da classe
public class CourseRestController {
	
	@Autowired
	private CourseService courseService;

	@PostMapping("/course")  //localhost:8080/course -> chama o método para adicionar cursos via método POST(Postman) no banco de dados(MySQL);
	public ResponseEntity<String> createCourse(@RequestBody Course course) {
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);		
	}
	
	@GetMapping("/course/{cid}") //localhost:8080/course/{cid} (course_id) -> chama o método para buscar curso específico via método GET(Postman) no banco de dados(MySQL);
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid){
		Course course = courseService.getById(cid);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}
	
	@GetMapping("/courses") //localhost:8080/courses -> chama o método para buscar todos os cursos via método GET(Postman) no banco de dados(MySQL);
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}
	
	@PutMapping("/course") //localhost:8080/courses -> chama o método para alterar curso específico via método PUT(Postman) no banco de dados(MySQL);
	public ResponseEntity<String> updateCourse(@RequestBody Course course) {
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.OK);		
	}
	
	@DeleteMapping("/course/{cid}") //localhost:8080/course/{cid} (course_id) -> chama o método para deletar curso específico via método DELETE(Postman) no banco de dados(MySQL);
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid){
		String status = courseService.deletedById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
