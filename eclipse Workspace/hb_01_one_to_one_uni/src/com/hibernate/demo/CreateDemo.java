package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

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
			
			//create objects
			
			Instructor tempInstructor=
						new Instructor("Feras","Jamal","fjinst@gmail.com");
			
			
			InstructorDetail tempInstructorDetail=
					new InstructorDetail("http://someYoutubechannel.com","swimming");
		
		
			//associate the objects together
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			
			//start a transaction
			session.beginTransaction();
			
			
			//save instructor
			//this will also save instructordetail due to CASCADEType.ALL
			System.out.println("Saving Instructor " + tempInstructor);
			session.save(tempInstructor);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!");
		}
		finally {
				factory.close();
		}
		
	}

}
