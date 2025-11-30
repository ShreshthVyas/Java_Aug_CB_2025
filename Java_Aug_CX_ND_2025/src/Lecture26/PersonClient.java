package Lecture26;

public class PersonClient {
	static int count = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		add(10,20);
//		count++;
//		System.out.println(Person.count);
		Person p =  new Person(100,"Atul");
		p.SetAge(10);
		System.out.println(p.GetAge());
		System.out.println("hello");
//		Person p1=  new Person(20, "Manish");
//		System.out.println(p.name + " " + p.id);
//		System.out.println(p1.name + " " + p1.id);
		
//		
		
//		p.greet("Shreshth");
//		p1.greet("Shreshth");
		
//		System.out.println(Person.count);
	}
	public static int add(int a, int b) {
		count++;
		return a+b;
	}
	
	
}
