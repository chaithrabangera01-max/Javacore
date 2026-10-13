package btwtheclass;

class Vehicle {

    public Vehicle() {
        System.out.println("This is Vehicle");
    }
}

public class Car extends Vehicle {
	
	  public Car() {
	        this("Car Second");
	        System.out.println("Car First");
	    }

	    public Car(String a) {
	        this("Car", "Third");
	        System.out.println(a);
	    }

	    public Car(String a, String b) {
	        super();
	        System.out.println(a + " " + b);
	    }

	    public static void main(String[] args) {

	        System.out.println("-----MS-------");

	        Car c = new Car();

	        System.out.println("-----ME-------");
	    }

}
