package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class CreateStudentDemo {

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
			Student student = new Student("abir", "ouni", "abir@gmail.com") ;
			// start transaction 
			session.beginTransaction();
			
			//save the student
			session.save(student);
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done saving Objet ");
		} finally {
			factory.close();
		}
		
	}

}
