package Controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setS_id(101);
		s1.setS_name("rohan");
		s1.setS_sec('A');
		
		Student s2=new Student();
		s2.setS_id(102);
		s2.setS_name("shreya");
		s2.setS_sec('A');
		
		Student s3=new Student();
		s3.setS_id(103);
		s3.setS_name("riya");
		s3.setS_sec('A');
		
		
		Trainer t1=new Trainer();
		t1.setT_id(201);
		t1.setT_name("Prajwal");
		
		//linking trainer to student
		///puting student to the arraylist and hand over to the trainer
		List<Student> l1=new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		//is handing that paper list to Prajwal.
		t1.setL1(l1);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(t1);
		et.commit();
		System.out.println("Done");
	}

}
