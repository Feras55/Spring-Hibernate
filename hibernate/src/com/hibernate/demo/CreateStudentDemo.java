package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class CreateStudentDemo {

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
			
			//create Student object
			
			Student tempStudent = new Student("Paul","John","paulJohn@gmail.com");
			
			//start a transaction
			session.beginTransaction();
				
			//save student object
			System.out.println("Saving object.. ");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!");
		}
		finally {
				factory.close();
		}
		
	}

}
