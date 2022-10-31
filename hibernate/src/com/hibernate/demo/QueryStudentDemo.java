package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
			
		//create Session Factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		//Create session
		Session session = factory.getCurrentSession();
		
		
		try {
			
			//start transaction
			session.beginTransaction();
				
			
			//query students
			List<Student>students = session.createQuery("from Student").getResultList();
			
			//display query results
			displayQueryResults(students);
			
			System.out.println("\n\n =======================Next Query ======================\n");
			
			//query students: lastName =Doe
			students = session.createQuery("from Student s where s.lastName = 'Doe' ").getResultList();
			
			//display query results
			displayQueryResults(students);
			
			
			System.out.println("\n\n =======================Next Query ======================\n");

			//query students: lastName = 'Doe' OR firstName = 'Daffy'
			
			students = session.createQuery("from Student s where s.lastName = 'Doe'"
					+ " OR s.firstName = 'Daffy' ").getResultList();
			
			
			displayQueryResults(students);
			
			
			System.out.println("\n\n =======================Next Query ======================\n");

			//query students where email LIKE '%luve2code.com'
			students = session.createQuery("from Student s "
					+ " where s.email LIKE '%gmail.com' ").getResultList();
			displayQueryResults(students);

			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("done!!");
		}
		finally {
				factory.close();
		}
		
	}

	private static void displayQueryResults(List<Student> students) {
		for(Student tempStudent: students) {
			System.out.println(tempStudent);
		}
	}

}
