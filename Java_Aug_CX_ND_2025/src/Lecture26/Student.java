package Lecture26;

public class Student {
	int id;
	String name;
	
	public Student() {
		
	}
	public Student(int i) {
		id = i;
	}
	public Student(int i,String n) {
		id = i;
		name = n;
	}
	
	
	public  void f() {
		System.out.println("Hello from method f");
	}
}
