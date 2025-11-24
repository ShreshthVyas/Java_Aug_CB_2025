package Lecture25;

public class PoerLogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans  = pow(3,4);
		System.out.println(ans);
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b ==0) {
			return 1;
		}
		int ans =  pow(a, b/2);
		if(b%2 ==0) {
			return ans * ans;
		}
		else {
			return ans * ans * a;
		}
	}

}
