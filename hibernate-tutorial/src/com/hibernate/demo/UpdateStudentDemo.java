package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//create a session
		Session session = factory.getCurrentSession();
		
		try {
			
			int idStudent = 1;
			//now get a new session for new transaction
			session =  factory.getCurrentSession();
			session.beginTransaction();
			//Retrieve student based on the id : primary key
			Student mystudent = session.get(Student.class, idStudent) ;
			mystudent.setFirstName("Scoooby"); //name is only updated in memory 
			System.out.println("Completed " + mystudent);
			//commit the transaction	
			session.getTransaction().commit();  //now name is updated in DB 
		
			session  = factory.getCurrentSession();
			session.beginTransaction();
			//update email for all students
			session.createQuery("update Student set email='all@gmail.com'").executeUpdate();
			session.getTransaction().commit();
			
			
		} finally {
			factory.close();
		}
		
	}

}
