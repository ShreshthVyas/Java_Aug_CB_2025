package Lecture22;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitionLeetcode {

	List<List<String>> ans= new ArrayList<>();
	public List<List<String>> partition(String s) {
        part(s, new ArrayList<>());
        return ans;
    }	
	public void part(String s,List<String> list) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			List<String> temp = new ArrayList<>(list);
			ans.add(temp);
			return;
		}
		
		for (int i = 1; i <= s.length(); i++) {
			String temp = s.substring(0,i);
			if(ispal(temp)) {
				list.add(temp);
				part(s.substring(i), list);
				list.remove(list.size()-1);//backtracking
			}
		}
	}
	
	public  boolean ispal(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
