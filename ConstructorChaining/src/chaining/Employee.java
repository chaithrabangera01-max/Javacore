package chaining;

public class Employee {
	 public Employee() {
	        this("Rahul");
	        System.out.println("First constructor");
	    }

	    public Employee(String name) {
	        this("Rahul", 25000);
	        System.out.println("Employee name: " + name);
	    }

	    public Employee(String name, int salary) {
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }

	    public static void main(String[] args) {

	        System.out.println("---MS---");

	        Employee e = new Employee();

	        System.out.println("---ME---");
	    }
}
