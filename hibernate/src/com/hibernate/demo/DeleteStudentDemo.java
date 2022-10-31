package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
			
		//create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		//Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			//use the session object to delete Java object
			System.out.println("Deleting Student Object");
			
			
			//start a transaction
			session.beginTransaction();

			
			int studentId = 1;
			
			
			//delete Student object
			
			//System.out.println("Getting student with id: " + studentId);
			
			//Student student = session.get(Student.class, studentId);
			
			//System.out.println("Deleting student: " + student);
			
			//session.delete(student);
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!");
			
			//perform update using HQL
		    session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			//Delete student where id = 2
			System.out.println("Delete student where id = 2");
			session.createQuery("delete from Student where id = 2 ").executeUpdate();
			
			
			
			
			
			session.getTransaction().commit();

			
		}
		finally {
				factory.close();
		}
		
	}

}
