package com.example.RestApiDay1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApiDay1.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	
List<Course> courseList=new ArrayList<>();

public CourseServiceImpl() {
	courseList.add(new Course(1, "Java","Java is programming language"));
}




@Override
public List<Course> getCourse() {
	
	return courseList;
}

@Override
public Course addCourse(Course course) {
	courseList.add(course);
	return course;
}
	

}
