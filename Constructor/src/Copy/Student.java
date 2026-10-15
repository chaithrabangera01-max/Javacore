package Copy;

public class Student {
	String name;
	char grade;
	public Student(String name, char grade) {
		this.name = name;
		this.grade = grade;
	}
	//copy constructor
	
	public Student(Student s2) {
		this.name=s2.name;
		this.grade=s2.grade;
	}
	
	
	public static void main(String[] args) {
		Student s1=new Student("Chaithra",'A');
		System.out.println(s1);
	}


	@Override
	public String toString() {
		return "Student name=" + name + " grade=" + grade;
	}
	
	

}
