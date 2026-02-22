package Lecture47;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 253;
		countsetbits(n);
		countsetbitOptimised(n);
	}

	private static void countsetbitOptimised(int n) {// O(SetBit)
		// TODO Auto-generated method stub
		int count =0;
		while(n>0) {
			n =  n & n-1;
			count++;
		}
		System.out.println(count);
	}

	private static void countsetbits(int n) {// O(32)
		// TODO Auto-generated method stub
		int count =0;
		while(n>0) {
			if((n&1) == 1) {
				count++;
			}
			n = n>>1;
		}
		System.out.println(count);
	}

}
