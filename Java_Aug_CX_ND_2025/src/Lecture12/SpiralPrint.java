package Lecture12;

import java.util.Scanner;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr =  new int[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		spiral(arr);
	}

	public static void spiral(int[][] arr) {
		// TODO Auto-generated method stub
		int minR = 0;
		int minC= 0;
		int maxR = arr.length-1;
		int maxC = arr[0].length-1;
		
		int total = arr.length* arr[0].length;
		
		int count = 0;
		while(count<total) {
			for (int i = minC; i <= maxC && count<total; i++) {
				System.out.print(arr[minR][i] + ", ");
				count++;
			}
			minR++;
			for (int i = minR; i <= maxR&& count<total; i++) {
				System.out.print(arr[i][maxC] + ", ");
				count++;
			}
			maxC--;
			for (int i = maxC; i>=minC&& count<total; i--) {
				System.out.print(arr[maxR][i] + ", ");
				count++;
			}
			maxR--;
			for (int i = maxR; i>=minR&& count<total; i--) {
				System.out.print(arr[i][minC] + ", ");
				count++;
			}
			minC++;
		}
		System.out.println("END");
		
	}

}
