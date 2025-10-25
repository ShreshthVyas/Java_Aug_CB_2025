package Lecture18;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
	}

	public static void print(int i) {
		// TODO Auto-generated method stub
		if(i==0) {
			return;
		}
		
		print(i-1);
		System.out.println(i);
		
	}

}
