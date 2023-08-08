package com.example.RestApiDay1.entity;

public class Course {
private int courseId;
private String courseName;
private String courseDescription;


 
public Course() {
	super();
	// TODO Auto-generated constructor stub
}


public Course(int courseId, String courseName, String courseDescription) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.courseDescription = courseDescription;
}


public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseDescription() {
	return courseDescription;
}
public void setCourseDescription(String courseDescription) {
	this.courseDescription = courseDescription;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription=" + courseDescription
			+ "]";
}


}
