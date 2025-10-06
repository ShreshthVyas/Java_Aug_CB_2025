package Lecture14;

public class MooreVotingAlgo {
	//next permutation
	//maximum circular sum
	//max path sum 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,3,1,1,1,4,4,5,1,1,1,6,7,1,1};
		int count =0;
		int me = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(count == 0) {
				me = arr[i];
			}
			if(arr[i]== me) {
				count++;
			}
			else {
				count--;
			}
		}
		
		System.out.println(me);
	}

}
