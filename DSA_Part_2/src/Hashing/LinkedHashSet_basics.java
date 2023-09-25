package Hashing;

import java.util.*;
import java.util.Iterator;

public class LinkedHashSet_basics {
	public static void main(String[] args) {
		LinkedHashSet<String> cities = new LinkedHashSet<>();
		cities.add("SambhajiNagar");
		cities.add("Jalna");
		cities.add("Beed");
		
		System.out.print(cities);
		
		Iterator<String> it = cities.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
