package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exception.StudentException;
import com.model.Student;
import com.service.StudentImpl;
import com.service.StudentService;

public class StudentApplication {
//Edited
	public static void main(String[] args) {
//		System.out.println("Enter the name to be searched");
		Scanner scanner = new Scanner(System.in);
//		String inputName = scanner.next();
		Student student1 = new Student(1235, "Kumaran", 23, "M", 498, "Chennai");
		Student student2 = new Student(1234, "Thiru", 23, "M", 498,"Mumbai");
		Student student3 = new Student(1236, "Nitya", 43, "F", 468,"Chennai");
		Student student4 = new Student(1237, "Bhuvanesh", 55, "M", 498,"Bangalore");
		Student student5 = new Student(1238, "Nitya", 24, "F", 488,"Chennai");
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

		
////		find student details by searching the name of the student
		StudentService service = new StudentImpl();
//		String result = null;
//		try {
//			result = service.searchByName(student, inputName);
//		} catch (StudentException e) {
//			e.getMessage();
//		}
//		System.out.println(result);
//		
////		find by name and return student object  
//		try {
//			Student searchResult = service.findByName(student, inputName);
//			System.out.println("Student Number : " + searchResult.getStudentID());
//			System.out.println("Student Name : " + searchResult.getStudentName());
//			System.out.println("Student Age : " + searchResult.getAge());
//			System.out.println("Student Gender : " + searchResult.getGender());
//			System.out.println("Student Marks : " + searchResult.getMarks());
//		} catch (StudentException e) {
//			System.err.println(e.getErrorMessage());
//		}
//		
////		find by student ID and return student object
//		
//		  System.out.println("Enter the number to be searched"); int inputNumber =
//		  scanner.nextInt(); try { Student IdResult = service.findByID(students,
//		  inputNumber); System.out.println("Student Number : " +
//		  IdResult.getStudentID()); System.out.println("Student Name : " +
//		  IdResult.getStudentName()); System.out.println("Student Age : " +
//		  IdResult.getAge()); System.out.println("Student Gender : " +
//		  IdResult.getGender()); System.out.println("Student Marks : " +
//		  IdResult.getMarks()); } catch (StudentException e) {
//		  System.err.println(e.getErrorMessage()); }
		 

		
		
//		//find list of students and return student list
//		try {
//			List<Student> resultList =  service.findByCollection(students, inputName);
//			for (Student student : resultList) {
//				System.out.println("Student Number " + student.getStudentID());
//				System.out.println("Student Name " + student.getStudentName());
//				System.out.println("Student Age " + student.getAge());
//				System.out.println("Student Gender " + student.getGender());
//				System.out.println("Student Marks " + student.getMarks());
//
//			}
//		} catch (StudentException e) {
//			System.err.println(e.getErrorMessage());
//		}
		
		
		//find list of students who stays in chennai
		System.out.println("Enter the city");
		String resultAddress = scanner.next();
try {
	List<Student> searchAddress = service.findByLocation(students, resultAddress);
	System.out.println("No of Students in "+resultAddress +" are "+ searchAddress.size());
	for (Student student : searchAddress) {
		System.out.println("Student Name "+ student.getStudentName());
		System.out.println("Student Address "+ student.getAddress());
	}
} catch (StudentException e) {
	System.err.println(e.getErrorMessage());
}
//finally {
//	
//	System.out.println("No of Students in "+resultAddress +" are "+ searchAddress.size());
//}
//	}
	scanner.close();
	}
	}
