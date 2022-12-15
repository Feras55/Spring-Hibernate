package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class DeleteInstructorDetailDemo {

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
			int myId = 3;
			
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, myId);
			
			//print instructorDetail
			System.out.println("temp instructor detail: " + tempInstructorDetail);
			
			//print the associated instructor
			System.out.println("Associated instructor: " + tempInstructorDetail.getInstructor());
		
			
			//let's delete instructor detail and see how it cascades to delete the instructor
			
			System.out.println("Deleting instructor detail: " + tempInstructorDetail);
			
			//since we decided not to cascade the delete to instructor
			//and the association is bidirectional between instructor and instructorDetail
			//we can't simply remove instructorDetail because there is still an association from instructor to instructor detail
			//in another words, instructor can't have an attribute instructor detail that is suddenly deleted
			//thus we have to break this association between instructor and details, by setting the instructor detail in instructor object to null
			
			
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			
		
			
			session.delete(tempInstructorDetail);
			
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
