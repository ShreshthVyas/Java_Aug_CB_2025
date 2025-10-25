package Lecture18;

public class Print1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
	}

	public static void print(int n) {
		// TODO Auto-generated method stub
		if(n>10) {// base case
			return;
		}
		System.out.println(n);// small sub-problem
		print(n+1);// recursive case
		
	}

}
