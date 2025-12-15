package Lecture30;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		add(10,20,30);
//		add(10,20,30,40,50,60);
		
	}

	private static void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
	}
//	private static int add(int i, int j) {
//		// TODO Auto-generated method stub
//		System.out.println(i+j);
//	}
	private static void add(int i, int j,int k) {
		// TODO Auto-generated method stub
		System.out.println(i+j+k);
	}
	private static void add(int i, double j,int k) {
		// TODO Auto-generated method stub
		System.out.println(i+j+k);
	}
	
	private static void add(int a,boolean b,int... i) {
		// TODO Auto-generated method stub
//		int arr[] = i;
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]+ " ");
		}
	}

}
