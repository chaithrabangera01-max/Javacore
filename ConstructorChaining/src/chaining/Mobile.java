package chaining;

public class Mobile {
	 public Mobile() {
	        this("Samsung");
	        System.out.println("First constructor");
	    }

	    public Mobile(String brand) {
	        this("Samsung", 25000);
	        System.out.println("Brand: " + brand);
	    }

	    public Mobile(String brand, int price) {
	        System.out.println("Brand: " + brand);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {

	        System.out.println("---MS---");

	        Mobile m = new Mobile();

	        System.out.println("---ME---");
	    } 
	
}
