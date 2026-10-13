package Controller;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Student {
	private String s_name;
	@Id
	private int s_id;
	private char s_sec;
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public char getS_sec() {
		return s_sec;
	}
	public void setS_sec(char s_sec) {
		this.s_sec = s_sec;
	}
	
	@ManyToMany
	List<Course>l2;
	public List<Course> getL2() {
		return l2;
	}
	public void setL2(List<Course> l2) {
		this.l2 = l2;
	}
}
