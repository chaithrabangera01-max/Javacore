package Controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	public static void main(String[]args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setS_id(101);
		s1.setS_name("prajanya");
		s1.setS_sec('A');
		
		Student s2=new Student();
		s2.setS_id(102);
		s2.setS_name("chaithra");
		s2.setS_sec('A');
		
		Student s3=new Student();
		s3.setS_id(103);
		s3.setS_name("manvi");
		s3.setS_sec('A');
		
		Course c1=new Course();
		c1.setC_id(1);
		c1.setC_name("java");
		
		Course c2=new Course();
		c2.setC_id(2);
		c2.setC_name("React");
		
		
		//students who takes a course
		List<Student>l1=new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		//courses can taken by stduent
		List<Course>l2=new ArrayList<>();
		l2.add(c1);
		l2.add(c2);
		
		
		//linking course-->student
		c1.setL1(l1);
		c2.setL1(l1);
		
		s1.setL2(l2);
		s2.setL2(l2);
		s3.setL2(l2);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(c1);
		em.persist(c2);
		et.commit();
		System.out.println("Done");
	}
}