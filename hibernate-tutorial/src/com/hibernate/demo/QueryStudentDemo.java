package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create a session
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			// query the list of student
			List<Student> theStudents = session.createQuery("from Student ").getResultList();
			// display the list
			for (Student student : theStudents) {
				System.out.println(student);
			}

			// query all students: lastName="daffy"
			theStudents = session.createQuery("from Student s where s.lastName='daffy'").getResultList();
			for (Student student : theStudents) {
				System.out.println(student);
			}



		} finally {
			factory.close();
		}

	}

}
