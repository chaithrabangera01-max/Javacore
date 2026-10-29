package sortbyname;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int age;
	int marks;
	double cgpa;

	public Student(String name, int age, int marks, double cgpa) {
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.cgpa = cgpa;
	}


	
	
}

public class Demo {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>(
				Arrays.asList(new Student("chaithra", 21, 95, 9.2), new Student("vishwa", 22, 85, 9.3),
						new Student("kelvin", 23, 90, 9.4), new Student("akansh", 24, 88, 9.5)));

		Comparator<Student> com = (a, b) -> a.name.compareTo(b.name);
		Collections.sort(list, com);
		
		

		list.forEach((s) -> System.out.println(s.name));

	}

}
