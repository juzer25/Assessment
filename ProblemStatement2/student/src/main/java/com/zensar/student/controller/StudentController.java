package com.zensar.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.student.model.Student;
import com.zensar.student.service.StudentService;

@RestController
@RequestMapping(value="/api/students")//It is used to map the url
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public Iterable<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@PostMapping(value="create")//TO add the student
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@GetMapping(value="/student/{rollNo}")// To get all the information of student
	public Student getStudent(@PathVariable("rollNo")int rollNo) {
		return studentService.getStudent(rollNo);
	}
	
	@DeleteMapping(value="student/{rollNo}")//To delete the student information
		public void deleteStudent(@PathVariable("rollNo") int rollNo) {
			studentService.deleteStudent(rollNo);
		}
	
	@PutMapping(value="/student/{rollNo}/{newSemester:.+}")//For updating the student information
	public Student updateStudentSemester(@PathVariable("rollNo")int rollNo , @PathVariable("newSemester")int newSemester) {
		return studentService.updateStudentSemester(rollNo, newSemester);
	}
	

}
