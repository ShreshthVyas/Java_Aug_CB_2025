package Lecture47;

public class CheckIthbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n =  231;
		int  i = 6;
		int mask = 1<<i;
		System.out.println(mask);
		if((n&mask) == 0) {
			System.out.println("Not Set");
		}
		else {
			System.out.println("Set");
		}
	}

}
