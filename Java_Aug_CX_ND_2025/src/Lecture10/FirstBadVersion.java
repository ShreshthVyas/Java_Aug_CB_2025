package Lecture10;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		int ans = -1;
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
			if(isBadVersion(mid)== true) {//  mid is bad
				ans =  mid;
				hi = mid-1;
			}
			else {// mid is good
				lo = mid+1;
			}
		}
		return ans;
	}
	public boolean isBadVersion(int version) {
		return false;
	}

}
