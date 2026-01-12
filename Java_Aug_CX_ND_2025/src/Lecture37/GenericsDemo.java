package Lecture37;

public class GenericsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] =  {1,2,3,4,5};
		String brr[] = {"A" ,"B" , "C" , "D" , "E"};
		Double crr[] = {1.2,3.4,5.6};
		Display(brr);
		Display(arr);
		Display(crr);
	}

	private static <T>void Display(T[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
