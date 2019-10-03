package com.zensar.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.student.dao.StudentDao;
import com.zensar.student.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	//method to add a student
	public Student addStudent(Student student) 
	{
		studentDao.save(student);
		return student;
	}
	
	//method to get a student by rollNo
	public Student getStudent(int rollNo) {
		return studentDao.findOne(rollNo);
	}

	//method to get all students
	public Iterable<Student> getAllStudent(){
		return studentDao.findAll();
	}
	
	//method to delete specific student
	public void deleteStudent(int rollNo) {
		studentDao.delete(rollNo);
	}
	
	//method to update the student semester
	public Student updateStudentSemester(int rollNo,int newSemester) {
		Student studentDb = studentDao.findOne(rollNo);
		studentDb.setSemester(newSemester);
		Student updateStudent = studentDao.save(studentDb);
		return updateStudent;
	}
	
	
}
