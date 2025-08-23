package Lecture1;

public class SumOFmultipleofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		
		while(i<=50) {
			if(i%3 == 0) {
				sum = sum+i;
			}
			i = i+1;
		}
		
		System.out.println(sum);
		
	}

}
