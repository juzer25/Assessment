package com.student.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.entity.Student;

public class StudentMain {

	public static void main(String[] args) {

		try {
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

			Session session = sessionFactory.openSession();

			Transaction transaction = session.beginTransaction();

			//making the Student instance
			Student student = new Student();
			//setting the values using setters
			student.setStudentName("joj");
			student.setStudentAddress("Bangalore");
			student.setPhoneNo(965734185);
			student.setGender("male");
			student.setBloodGroup("B+");
			student.setAge(23);
			
			//setting the values using Parametrized constructor
			Student student1 = new Student("sania","Bangalore",123432L,"female","O+",22);

			session.save(student);
			session.save(student1);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
