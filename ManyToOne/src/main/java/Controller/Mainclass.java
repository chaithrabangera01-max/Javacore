package Controller;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction	et=em.getTransaction();

	Student s1=new Student();
	s1.setStd_id(101);
	s1.setStd_name("Tony");
	s1.setStd_sec('A');
	
	Student s2=new Student();
	s2.setStd_id(102);
	s2.setStd_name("Pepper");
	s2.setStd_sec('B');
	
	
	Student s3=new Student();
	s3.setStd_id(103);
	s3.setStd_name("Stark");
	s3.setStd_sec('c');
	
	
	Trainer t1=new Trainer();
	t1.setT_id(11);
	t1.setT_name("Sudeep");
	
	//linking student to teacher
	s1.setT1(t1);
	s2.setT1(t1);
	s3.setT1(t1);
	
	
	et.begin();
	em.persist(t1);
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	et.commit();
	System.out.println("Done");
	
	

	}

}
