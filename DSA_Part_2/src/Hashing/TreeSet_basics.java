package Hashing;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet_basics {
	public static void main(String[] args) {
		TreeSet<String> cities = new TreeSet<>();
		cities.add("SambhajiNagar");
		cities.add("Jalna");
		cities.add("Beed");
		cities.add("Aurangabad");
		
		System.out.print(cities);
	}
}
