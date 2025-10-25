package Lecture18;

public class SumofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int ans  = sum(n);
		System.out.println(ans);
	}

	public static int sum(int n) {
		// TODO Auto-generated method stub
		if(n== 1) {
			return 1;
		}
		int sum_n_minus_one = sum(n-1);
		return sum_n_minus_one + n;
	}

}
