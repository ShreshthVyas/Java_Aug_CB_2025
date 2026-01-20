package Lecture39;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for(int i: nums1){
            set1.add(i);
        }

        for(int i: nums2){
            if(set1.contains(i)){//intersection
                ans.add(i);
            }
        }

        int[] a = new int[ans.size()];
        int k =0;

        for(int i: ans){
            a[k] = i;
            k++;
        }
        return a;
    }

}
