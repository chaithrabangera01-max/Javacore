package Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	Person p1=new Person();
	p1.setP_id(1);
	p1.setP_name("Chaithra");
	p1.setP_phone(9008368498l);
	
	Person p2=new Person();
	p2.setP_id(2);
	p2.setP_name("shreya");
	p2.setP_phone(9945291421l);
	
	Pancard pc1=new Pancard();
	pc1.setPan_no("ABJDV87T585B5");
	
	Pancard pc2=new Pancard();
	pc2.setPan_no("HSHDD7799HGDD");
	
	//linking Person to pancard
	p1.setPc1(pc1);
	p2.setPc1(pc2);
	
	//linking pancard to person
	
	pc1.setP1(p1);
	pc2.setP1(p2);
	
	
	
	
	et.begin();
	em.persist(p1);
	em.persist(p2);
	em.persist(pc1);
	em.persist(pc2);
	System.out.println("Values are inserted");
	et.commit();
	
	}

}
