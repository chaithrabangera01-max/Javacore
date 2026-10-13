package btwtheclass;

class College {

    public College() {
        System.out.println("This is College");
    }
}

public class Student extends College{
	 public Student() {
	        this("This is Second");
	        System.out.println("This is First");
	    }

	    public Student(String a) {
	        this("This is", "Third");
	        System.out.println(a);
	    }

	    public Student(String a, String b) {
	        super();
	        System.out.println(a + " " + b);
	    }

	    public static void main(String[] args) {

	        System.out.println("-----MS-------");

	        Student n = new Student();

	        System.out.println("-----ME-------");
	    }
}
