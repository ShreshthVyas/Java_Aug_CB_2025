package Lecture21;

public class CoinComibination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {1,2,5};
		int target = 5;
		
		int ans = rec(arr,target,"");
		System.out.println(ans);
	}

	public static int rec(int[] arr, int target, String ans) {
		// TODO Auto-generated method stub
		if(target == 0) {
			System.out.println(ans);
			return 1;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(target>=arr[i]) {
				count+=rec(arr, target- arr[i], ans+arr[i]);
			}
		}
		return count;
		
	}
//	public static void rec(int[] arr, int target, String ans) {
//		// TODO Auto-generated method stub
//		if(target == 0) {
//			System.out.println(ans);
//			return ;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if(target>=arr[i]) {
//				rec(arr, target- arr[i], ans+arr[i]);
//			}
//		}
//		
//	}

}
