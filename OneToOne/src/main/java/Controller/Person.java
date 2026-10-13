package Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int p_id;
	private String p_name;
	private long p_phone;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public long getP_phone() {
		return p_phone;
	}
	public void setP_phone(long p_phone) {
		this.p_phone = p_phone;
	}
	@OneToOne
	Pancard pc1;
	public Pancard getPc1() {
		return pc1;
	}
	public void setPc1(Pancard pc1) {
		this.pc1 = pc1;
	}
	
	

}
