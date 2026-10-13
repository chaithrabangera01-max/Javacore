package Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Pancard {
	@Id
	private String pan_no;

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
@OneToOne
	Person p1;

public Person getP1() {
	return p1;
}

public void setP1(Person p1) {
	this.p1 = p1;
}


}

