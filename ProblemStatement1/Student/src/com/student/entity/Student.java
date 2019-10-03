package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


//This a entity class persisting in database
@Entity
@Table(name="student_details") //Naming the table
public class Student {

	//this will make the field as primary key
	@Id
	@GeneratedValue //by default Auto_Increment
	@Column(name="student_Id")
	private int studentId;

	@Column(name="student_name")
	private String studentName;

	@Column(name="student_address")
	private String studentAddress;
	
	@Column(name="phone_no")
	private long phoneNo;
	
	@Column(name="gender")
	private String gender;

	@Column(name="blood_group")
	private String bloodGroup;

	@Column(name="age")
	private int age;

	//Generating Getters and Setters of the fields
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//default Constructor
	public Student() {
		
	}

	//Parameterized Constructor
	public Student(String studentName, String studentAddress, long phoneNo, String gender,
			String bloodGroup, int age) {
		super();
		
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.age = age;
	}
	
	
	

}
