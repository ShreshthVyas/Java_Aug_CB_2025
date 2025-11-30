package Lecture26;

public class Person {
	int id ;
	private int age;
	String name;
	static int count =0;
	public Person(int id ,String name){
		count++;
		this.id  = id;
		this.name =  name;
	}
	
	public void greet(String name) {
		System.out.println(this.name + " greets " + name);
	}
//	static {
//		int p=10;
//		System.out.println("Hello from static");
//	}
	
	public void SetAge(int age) {
		
		try {
			if(age<0) {
				throw new Exception("Age cannot be negetive");
			}
			else {
				this.age = age;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("hello from finally");
		}
		
	}
	public int GetAge() {
		return this.age;
	}
}
