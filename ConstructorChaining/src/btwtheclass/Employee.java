package btwtheclass;

class Company {

    public Company() {
        System.out.println("This is Company");
    }
}

public class Employee extends Company {
	 public Employee() {
	        this("Employee Second");
	        System.out.println("Employee First");
	    }

	    public Employee(String a) {
	        this("Employee", "Third");
	        System.out.println(a);
	    }

	    public Employee(String a, String b) {
	        super();
	        System.out.println(a + " " + b);
	    }

	    public static void main(String[] args) {

	        System.out.println("-----MS-------");

	        Employee e = new Employee();

	        System.out.println("-----ME-------");
	    }

}
