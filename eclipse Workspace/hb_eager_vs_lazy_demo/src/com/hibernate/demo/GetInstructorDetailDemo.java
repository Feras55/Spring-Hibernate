package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class GetInstructorDetailDemo {

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
			
			
			//get instructorDetail object
			int myId = 21231;
			
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, myId);
			
			//print instructorDetail
			System.out.println("temp instructor detail: " + tempInstructorDetail);
			
			//print the associated instructor
			System.out.println("Associated instructor: " + tempInstructorDetail.getInstructor());
		
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("done!!");
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		finally {
				//handle connection leak issue
				session.close();
				factory.close();
		}
		
	}

}
