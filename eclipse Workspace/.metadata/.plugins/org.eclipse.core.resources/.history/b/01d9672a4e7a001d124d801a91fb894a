package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
			
		//create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		//Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			//use the session object to update Java object
			System.out.println("Updating Student Object");
			

			
			//start a transaction
			session.beginTransaction();

			
			int studentId = 1;
			
			
			//update Student object
			
			System.out.println("Getting student with id: " + studentId);
			
			Student student = session.get(Student.class, studentId);
			
			System.out.println("Updating student");
			student.setFirstName("Scooby");			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!");
			
			//perform update using HQL
		    session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			//update email for all students
			System.out.println("update email for all students");
			session.createQuery("update Student set email = 'foo@gmail.com' ").executeUpdate();
			
			
			
			
			
			session.getTransaction().commit();

			
		}
		finally {
				factory.close();
		}
		
	}

}
