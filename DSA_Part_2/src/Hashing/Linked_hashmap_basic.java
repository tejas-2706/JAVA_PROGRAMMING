package Hashing;
import java.util.*;
public class Linked_hashmap_basic {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
//		keys are printed in insertion ordered
//		doubly LL used instead of singly LL
		lhm.put("india", 100);
		lhm.put("china", 900);
		lhm.put("arab", 10);
		
		System.out.println(lhm);

	}
}
