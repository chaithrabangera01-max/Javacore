package sortcgpa;

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
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", marks=" + marks + ", cgpa=" + cgpa + " ";
	}
}

public class Demo {
	public static void main(String[] args) {
		
	List<Student> list=new ArrayList<>(
			Arrays.asList(new Student("Vishwa",12,90,8.9), new Student("Janani",13,85,10),
					new Student("Prajnaesh",14,67,2.6),new Student("Karthik",15,33,9.12)));
	
	Comparator<Student> com=(c1,c2)->Double.compare(c1.cgpa,c2.cgpa);
	Collections.sort(list,com.reversed());
	
	list.forEach((s)->System.out.println(s.cgpa));
	
	
	
	}

}
