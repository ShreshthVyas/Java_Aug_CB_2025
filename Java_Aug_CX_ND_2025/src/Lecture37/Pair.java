package Lecture37;

public class Pair <K, V> {
	K key;
	V val;

	public Pair(K key, V val) {
		this.key = key;
		this.val = val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, String> p = new Pair<>(10, "A");
		System.out.println(p.val);
		Pair<String, String> p1 = new Pair<>("C", "A");
		System.out.println(p.val);
		Pair<Integer, Integer> p2 = new Pair<>(10, 20);
		System.out.println(p.val);

	}


}
