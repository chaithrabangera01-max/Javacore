package Copy;

public class sam23 {
	String n;
	int id;
	public sam23(String n, int id) {
		this.n = n;
		this.id = id;
	}
	//copy constructor
	public sam23(sam23 s1) {
		this.n=s1.n;
		this.id=s1.id;
	}
	
	//over riding tostring
	
	@Override
	public String toString() {
		return n+" "+id;
	}
	
	
	public static void main(String[] args) {
		sam23 n=new sam23("Eleven",011);
		System.out.println(n);
		
		sam23 n1=new sam23(n);
		System.out.println(n1);
		
	}
	
	

}
