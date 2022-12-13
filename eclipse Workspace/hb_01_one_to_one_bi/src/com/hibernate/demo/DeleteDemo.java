package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class DeleteDemo {

	public static void main(String[] args) {
			
		//create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		
		//Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			

		
		
			
			//start a transaction
			session.beginTransaction();
			
			
			//get instructor by primary key
			
			Instructor tempInstructor = session.get(Instructor.class, 1); //gets the object with id 1, returns null if none found
			
			//delete instructor
			System.out.println("Found Instructor " + tempInstructor);

			
			if (tempInstructor != null) {
				System.out.println("Delete instructor");
				
				//cascades delete to instructor detail
				session.delete(tempInstructor);
			}
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!");
		}
		finally {
				factory.close();
		}
		
	}

}
