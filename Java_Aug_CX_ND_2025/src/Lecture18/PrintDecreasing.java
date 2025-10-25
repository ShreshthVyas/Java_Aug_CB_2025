package Lecture18;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printdec(10);
	}

	public static void printdec(int i) {
		// TODO Auto-generated method stub
		if(i == 0) {
			return;
		}
		
		System.out.println(i);
		printdec(i-1);
		
	}

}
