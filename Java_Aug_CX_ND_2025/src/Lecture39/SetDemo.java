package Lecture39;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedHashSet<Integer> set =  new LinkedHashSet<>();
//		TreeSet<Integer> set =  new TreeSet<>(Collections.reverseOrder());
		TreeSet<Integer> set =  new TreeSet<>();
//		HashSet<Integer> set =  new HashSet<>();
		set.add(30);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(20);
		
		System.out.println(set);
		System.out.println(set.contains(10));
		set.remove(10);
		
		System.out.println(set.contains(10));
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println(set);
	}

}
