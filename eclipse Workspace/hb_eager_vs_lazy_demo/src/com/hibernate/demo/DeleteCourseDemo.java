package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class DeleteCourseDemo {

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
						
			//delete course, make sure to not cascade delete to instructor, and break the bi-directional association btw instructor and courses
			
			Course tempCourse = session.get(Course.class,10);
			
			System.out.println("Removing course: " + tempCourse);
			session.remove(tempCourse);
			

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
