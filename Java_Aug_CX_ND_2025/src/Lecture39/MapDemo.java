package Lecture39;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("A", 10);
//		map.put("Fjyfjyf", 14);
//		map.put("Bouugfgu", 9);
//		map.put("C", 8);
//		map.put(null, 91);
//		map.put("E", null);
//		map.put("A", null);
//		map.put("F", 14);
//		map.put(null, 100);
//		map.put("null", 10);
//		
//		
//		map.remove("B");
//		
//		System.out.println(map.get("B"));
//		
//		for (String s : map.keySet()) {
//			System.out.println(map.get(s));
//		}
//		System.out.println(map.getOrDefault("Ayd", 0));
//		System.out.println(map);
		
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
//		map.put("z", 10);
//		map.put("A", 10);
//		map.put("Fjyfjyf", 14);
//		map.put("Bouugfgu", 9);
//		map.put("C", 8);
//		map.put(null, 91);
//		map.put("E", null);
//		map.put("A", null);
//		map.put("F", 14);
//		map.put(null, 100);
//		map.put("null", 10);
//		
//		
//		map.remove("B");
//		
//		System.out.println(map.get("B"));
//		
//		for (String s : map.keySet()) {
//			System.out.println(map.get(s));
//		}
//		System.out.println(map.getOrDefault("Ayd", 0));
//		System.out.println(map);
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("z", 10);
		map.put("A", 10);
		map.put("Fjyfjyf", 14);
		map.put("Bouugfgu", 9);
		map.put("C", 8);
//		map.put(null, 91);
		map.put("E", null);
		map.put("A", null);
		map.put("F", 14);
//		map.put(null, 100);
		map.put("null", 10);
		
		
		map.remove("B");
		
		System.out.println(map.get("B"));
		
		for (String s : map.keySet()) {
			System.out.println(map.get(s));
		}
		System.out.println(map.getOrDefault("Ayd", 0));
		System.out.println(map);
		
		
	}

}
