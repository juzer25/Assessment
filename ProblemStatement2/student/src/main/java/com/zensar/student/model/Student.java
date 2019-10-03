package com.zensar.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue
	@Column(name="roll_no")
	private int rollNo;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="phone_no")
	private long phoneNo;
	
	@Column(name="address")
	private String address;
	
	@Column(name="semester")
	private int semester;
	
	@Column(name="department")
	private String department;
	
	@Column(name="remarks")
	private String remarks;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public Student() {
		
	}
}
