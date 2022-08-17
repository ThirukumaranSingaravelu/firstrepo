package com.service;

import java.util.List;

import com.exception.StudentException;
import com.model.Student;

public interface StudentService {
//	find student details by searching the name of the student
	public abstract String searchByName(Student student, String searchName) throws StudentException;

//	find by name and return student object  
	public abstract Student findByName(Student student, String searchname) throws StudentException;

//	find by student ID and return student object
	public abstract Student findByID(List<Student> students, int studentNumber) throws StudentException;

//find list of students and return student list
	public abstract List<Student> findByCollection(List<Student> students, String searchName) throws StudentException;
//find list of students who stays in chennai
	public abstract List<Student> findByLocation(List<Student> students, String searchAddress) throws StudentException;
	
}
