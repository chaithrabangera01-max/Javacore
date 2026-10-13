package Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int s_id;
	private String s_name;
	private char s_sec;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public char getS_sec() {
		return s_sec;
	}
	public void setS_sec(char s_sec) {
		this.s_sec = s_sec;
	}
	
	
	

}
