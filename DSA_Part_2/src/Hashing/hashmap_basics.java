package Hashing;

//import java.util.HashMap;
//import java.util.Set;
import java.util.*;
public class hashmap_basics {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
//		put - O(1)
		hm.put("India", 150);
		hm.put("usa", 30);
		hm.put("UAE", 10);
		hm.put("Uk", 15);
		System.out.println(hm);
		
////		get - O(1)
//		int population = hm.get("usa");
//		System.out.println(population);
//
//		
////		contains - O(1)
//		System.out.println(hm.containsKey("India"));
//		System.out.println(hm.containsKey("Australia"));
//		
//		
////		remove  - O(1)
//		
//		System.out.println(hm.remove("indonesia"));
//		System.out.println(hm);
//
////		size 
//		System.out.println(hm.size());
//		
////		clear
//		hm.clear();
//		
////		is empty
//		System.out.print(hm.isEmpty());
//		
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		for (String k : keys) {
			System.out.println("Key = "+k + "&" + "Value = " + hm.get(k));
		}
		
		System.out.println(hm.size());

	}

}
