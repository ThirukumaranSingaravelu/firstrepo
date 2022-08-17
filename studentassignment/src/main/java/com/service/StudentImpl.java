package com.service;

import java.util.ArrayList;
import java.util.List;

import com.exception.StudentException;
import com.model.Student;

public class StudentImpl implements StudentService {
//	find student details by searching the name of the student

	public String searchByName(Student student, String searchName) throws StudentException {
		if (student.getStudentName().equals(searchName)) {
			return student.getStudentName() + " is Present ";
		} else {
			return student.getStudentName() + " is Not Present ";
		}

	}
//	find by name and return student object  

	public Student findByName(Student student, String searchname) throws StudentException {
		if (student.getStudentName().equals(searchname)) {
			return student;
		} else {
			throw new StudentException("Enter Valid Credentials");
		}

	}
//	find by student ID and return student object

	public Student findByID(List<Student> students, int studentNumber) throws StudentException {
		for (Student student : students) {
			if (student.getStudentID() == studentNumber) {
				return student;

			}

		}
		throw new StudentException("Enter valid Credentials");
	}
	//find list of students and return student list

	public List<Student> findByCollection(List<Student> students, String searchName) throws StudentException {
		
		List<Student> students2 = new ArrayList<Student>();
		for (Student student : students)
		{
			if(student.getStudentName().equals(searchName)) {
				students2.add(student);
			}
			else {
				continue;
			}
		}
		if(students2.size()>0) {
			return students2;
		}
		else {
		throw new StudentException("Enter valid Credentials");
	}

	}
	//find list of students who stays in chennai

	public List<Student> findByLocation(List<Student> students, String searchAddress) throws StudentException {
		List<Student> dummyList = new ArrayList<Student>();
		for (Student student : students) {
			if(student.getAddress().equals(searchAddress)) {
				dummyList.add(student);
			}
			else
			{
				continue;
			}
			
		}
		if(dummyList.size()>0) {
			return dummyList;
		}
		else {
			throw new StudentException("Enter Valid Credentials");
		}
		
	}
	}
