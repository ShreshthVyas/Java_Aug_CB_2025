package Lecture12;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] =  {1,2,3,4,5};
//		
//		for (int j : arr) {
//			System.out.println(j);
//		}
		int arr[][] = {{1,2,3,4}, 
				{11,22,33,44},
				{15,26,35,47},
				{13,24,35,43}};
		
		for (int[] a : arr) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
