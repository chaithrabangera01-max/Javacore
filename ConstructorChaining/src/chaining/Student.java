package chaining;

public class Student {
	public Student() {
        this("Thanvi");
        System.out.println("This is first constructor");
    }

    public Student(String name) {
        this("Thanvi", 22);
        System.out.println("Student name: " + name);
    }

    public Student(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        System.out.println("---MS---");

        Student s = new Student();

        System.out.println("---ME---");
    }
	

}
