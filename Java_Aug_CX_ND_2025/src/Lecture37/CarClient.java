package Lecture37;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c[] =  new Car[5];
		
		c[0] =  new Car(120, "A" , 300000);
		c[1] =  new Car(140, "B" , 450000);
		c[2] =  new Car(12, "F" , 30);
		c[3] =  new Car(134545, "Z" , 30099922);
		c[4] =  new Car(139, "E" , 90876);
	
		Arrays.sort(c,new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o2.name.compareTo(o1.name);
			}
		});
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
//
//	private static <T extends Comparable<T>>void sort(T[] arr) {
//		// TODO Auto-generated method stub
//		for (int pass = 1; pass < arr.length; pass++) {
//			for (int j = 0; j < arr.length-pass; j++) {
//				if(arr[j].compareTo(arr[j+1])>0) {
//					T t = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = t;
//				}
//			}
//		}
//	}


}
