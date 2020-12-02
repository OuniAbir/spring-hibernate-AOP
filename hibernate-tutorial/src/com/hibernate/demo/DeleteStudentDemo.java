package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		//create session factory
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		//create a session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start transaction 
			session.beginTransaction();
			session.createQuery("delete from Student where id=2").executeUpdate();
			//commit the transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
		
	}

}
