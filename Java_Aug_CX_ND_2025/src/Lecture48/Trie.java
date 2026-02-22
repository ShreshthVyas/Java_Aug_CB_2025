package Lecture48;

import java.util.HashMap;

public class Trie {
	public class Node {
		Character ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isEnd;
	}

	private Node root;

	public Trie() {
		Node nn = new Node();
		nn.ch = '*';
		root = nn;
	}

	public void insert(String word) {
		Node curr = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				Node nn = new Node();
				nn.ch = ch;
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isEnd = true;
	}

	public boolean search(String word) {
		Node curr = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return curr.isEnd;
	}

	public boolean startsWith(String prefix) {
		Node curr = root;

		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return false;
			}
		}
		return true;
	}
}
