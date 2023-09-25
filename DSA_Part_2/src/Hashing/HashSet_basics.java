package Hashing;
import java.util.*;
public class HashSet_basics {
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		cities.add("SambhajiNagar");
		cities.add("Jalna");
		cities.add("Beed");
		
		Iterator it = cities.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String city : cities) {
			System.out.println(city);
		}
	}
}
