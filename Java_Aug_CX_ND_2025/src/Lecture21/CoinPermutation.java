package Lecture21;

public class CoinPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {1,2,5};
		int target = 5;
		
		int ans = rec(arr,target,"",0);
		System.out.println(ans);
	}

	public static int rec(int[] arr, int target, String ans,int idx) {
		// TODO Auto-generated method stub
		if(target == 0) {
			System.out.println(ans);
			return 1;
		}
		int count = 0;
		for (int i = idx; i < arr.length; i++) {
			if(target>=arr[i]) {
				count+=rec(arr, target- arr[i], ans+arr[i],i);
			}
		}
		return count;
		
	}

}
