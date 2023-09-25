package Hashing;

import java.util.TreeMap;

public class TreeMap_basics {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();
//		Keys are sorted
//		RedBlackTress are used for implementation
//		BST
		tm.put("india", 100);
		tm.put("china", 900);
		tm.put("arab", 10);
		
		System.out.println(tm);
	}
}
