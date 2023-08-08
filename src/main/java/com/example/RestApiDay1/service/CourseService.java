package com.example.RestApiDay1.service;

import java.util.List;

import com.example.RestApiDay1.entity.Course;

public interface CourseService {

	

	List<Course> getCourse();

	Course addCourse(Course course);

}
