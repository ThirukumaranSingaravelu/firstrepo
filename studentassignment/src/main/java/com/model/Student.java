package com.model;

public class Student {
	private int studentID;
	private String studentName;
	private int age;
	private String gender;
	private int marks;
	private String address;

	public Student(int studentID, String studentName, int age, String gender, int marks, String address) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	public Student(int studentID, String studentName, int age, String gender, int marks) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
