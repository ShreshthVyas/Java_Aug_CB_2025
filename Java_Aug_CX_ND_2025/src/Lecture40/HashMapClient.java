package Lecture40;

public class HashMapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap<String , Integer> map = new Hashmap<>(5);
		map.put("A", 19);
		map.put("B", 19);
		map.put("C", 19);
		map.put("D", 19);
		map.put("E", 19);
		map.put("F", 19);
		map.put("A", 190);
		
		System.out.println(map);
		
		map.remove("F");
		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.get("F"));
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("F"));
	}

}
