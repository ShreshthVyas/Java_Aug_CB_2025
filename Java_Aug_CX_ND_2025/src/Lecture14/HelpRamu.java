package Lecture14;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  t =  sc.nextInt();
		while(t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int nor = sc.nextInt();
			int noc = sc.nextInt();
			
			
			int rick [] = new int[nor];
			int cab[] = new int[noc];
			
			for (int i = 0; i < rick.length; i++) {
				rick[i] = sc.nextInt();
			}
			for (int i = 0; i < cab.length; i++) {
				cab[i] = sc.nextInt();
			}
			
			int rick_cost  = findmincost(rick,c1,c2,c3);
			int cab_cost = findmincost(cab, c1, c2, c3);
			
			int ans =  Math.min(cab_cost+rick_cost, c4);
			System.out.println(ans);
			
		}
	}

	public static int findmincost(int[] arr, int c1, int c2, int c3) {
		// TODO Auto-generated method stub
		int cost =0;
		
		for (int i = 0; i < arr.length; i++) {
			cost += Math.min(arr[i]*c1, c2);
		}
		
		return Math.min(c3, cost);
		
	}

}
