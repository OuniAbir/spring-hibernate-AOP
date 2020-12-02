package com.hibernate.demo;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create a session
		Session session = factory.getCurrentSession();

		try {
			// create a student object
            System.out.println("creating a new student object ...");
 
            String theDateOfBirthStr = "31/12/1998";
 
            Date theDateOfBirth = DateUtils.parseDate(theDateOfBirthStr);
 
            Student student = new Student("Pauly", "Doe", "paul@luv.com", theDateOfBirth);
			// create a student object
			// start transaction
			session.beginTransaction();

			// save the student in memory,
			// if we don't do the commit and we do save for another student object the id of
			// that object keep incrementing
			session.save(student);

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Done saving Objet ");
		}catch (Exception exc) {
            exc.printStackTrace(); 
        } finally {
			factory.close();
		}

	}

}
