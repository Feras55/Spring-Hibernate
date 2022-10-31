package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

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
			System.out.println("Creating  3 Students Objects");
			
			//create 3 Student objects
			
			Student tempStudent1 = new Student("Saint","John","SaintJohn@gmail.com");
			Student tempStudent2 = new Student("Paula","Doe","paulaJohn@gmail.com");
			Student tempStudent3 = new Student("Paulinho","Joe","paulinhoJohn@gmail.com");

			//start a transaction
			session.beginTransaction();
				
			//save student object
			System.out.println("Saving students.. ");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!");
		}
		finally {
				factory.close();
		}
		
	}

}
