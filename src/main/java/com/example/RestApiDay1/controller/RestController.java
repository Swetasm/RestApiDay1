package com.example.RestApiDay1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.RestApiDay1.entity.Course;
import com.example.RestApiDay1.service.CourseService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses() {
		 return  courseService.getCourse();
	
		
	}
	
	
	  @PostMapping("/courses")
	  
	  public Course addCourse(@RequestBody Course course) { 
		  return this.courseService.addCourse(course);
	  
	  }
	 
}
