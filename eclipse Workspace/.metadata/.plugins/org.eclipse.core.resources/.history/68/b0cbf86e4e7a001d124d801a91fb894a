package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
			
		//create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		//Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			//use the session object to save Java object
			System.out.println("Creating Student Object");
			
			//read Student object
			
			Student tempStudent = new Student("Daffy","Duck","Quackwack@gmail.com");
			
			//start a transaction
			session.beginTransaction();
				
			//save student object
			System.out.println("Saving object.. ");
			System.out.println(tempStudent);

			session.save(tempStudent);
			//commit transaction

			session.getTransaction().commit();

			//find out the student's id (primary key)
			System.out.println("Student Saved. Generated id: " + tempStudent.getId());
			
			//get a new session, start a tran0saction
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			//retrieve student based on primary key
			
			System.out.println("\nGetting student with id: " + tempStudent.getId());
			
			Student student = session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get Complete: " + student);
			//commit transaction
			
			session.getTransaction().commit();
			
			System.out.println("done!!");
		}
		finally {
				factory.close();
		}
		
	}

}
