package Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
public class Course {
	private String c_name;
	@Id
	private int c_id;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@ManyToMany
	
	List<Student>l1;
	public List<Student> getL1() {
		return l1;
	}
	public void setL1(List<Student> l1) {
		this.l1 = l1;
	}
}
