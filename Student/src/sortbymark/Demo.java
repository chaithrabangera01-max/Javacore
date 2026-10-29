package sortbymark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


class Student{
	String name;
	int age;
	int marks;
	double cgpa;
	public Student(String name, int age, int marks, double cgpa) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student name=" + name + ", age=" + age + ", marks=" + marks + ", cgpa=" + cgpa + " ";
	}
}



public class Demo {
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>(
				Arrays.asList(new Student("chaithra",21,100,9.2),
				new Student("Poornima",23,95,9.2),
				new Student("Vaishnavi",25,20,10),
				new Student("Pooja",27,1,8.9)));
		
		Comparator<Student> com=(m1,m2)->m1.marks-m2.marks;
		Collections.sort(list,com.reversed());
		
		
		list.forEach((s)->System.out.println(s.marks));
	}

}
