package Lecture17;

public class MurthalParantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 10;
		int rank[] = {1,2,3,4};
		
		int ans  =  binarysearch(p,rank);
		System.out.println(ans);
	}

	public static int binarysearch(int p, int[] rank) {
		// TODO Auto-generated method stub
		int lo = 0;
		int maxR = 0;
		for (int i : rank) {
			maxR =  Math.max(i, maxR);
		}
		int hi = maxR * p*(p+1)/2;
		int ans = 0;
		while(lo<=hi) {
			int mid =  (lo+hi)/2;
			
			if(isItpossible(mid,rank,p)) {
				ans = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		
		return ans;
		
	}

	public static boolean isItpossible(int mid, int[] rank, int p) {
		// TODO Auto-generated method stub
		int count =0;
		
		for (int r : rank) {
			int time  =0;
			int k =1;
			while(time + (k*r)<=mid) {
				time+= (k*r);
				k++;
				count++;
				if(count>=p) {
					return true;
				}
			}
		}
		return false;
	}

}
