package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		//create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//create a session
		Session session = factory.getCurrentSession();
		
		try {
			//create a student object 
			Student student = new Student("Paull", "daffy", "Paull@gmail.com") ;
			// start transaction 
			session.beginTransaction();
			
			//save the student
			session.save(student);
			
			//commit the transaction
			session.getTransaction().commit();
			
			// find out the student's id : primary key
			System.out.println("Saved student. Generated id " + student.getId());
			
			//now get a new session for new transaction
			session =  factory.getCurrentSession();
			session.beginTransaction();
			
			//Retrieve student based on the id : primary key
			System.out.println("\n Getting the student with id : " + student.getId());
			Student mystudent = session.get(Student.class, student.getId()) ;
			System.out.println("Getting Student for DB " + mystudent );
			
			
		} finally {
			factory.close();
		}
		
	}

}
