package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class EagerLazyDemo {

	public static void main(String[] args) {
			
		//create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		
		//Create session
		Session session = factory.getCurrentSession();
		
		
		try {
				
			//start a transaction
			session.beginTransaction();
			
			
			//get instructor by id
			
			Instructor instructor = session.get(Instructor.class, 1); //get instructor with id = 1
			
			System.out.println("Instructor:  " + instructor);
			
			//retrieve courses
			System.out.println("Courses: " + instructor.getCourses());
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!");
		}
		finally {
			
				session.close();
				factory.close();
		}
		
	}

}
