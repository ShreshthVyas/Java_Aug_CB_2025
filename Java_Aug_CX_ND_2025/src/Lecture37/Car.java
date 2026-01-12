package Lecture37;

public class Car implements Comparable<Car>{

	int speed;
	String name;
	int price;
	
	public Car(int speed,String name,int price) {
		this.speed = speed;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.price + " " + this.speed;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
//		return this.price-o.price;
//		return this.speed - o.speed;
		return o.name.compareTo(this.name);
	}

}
