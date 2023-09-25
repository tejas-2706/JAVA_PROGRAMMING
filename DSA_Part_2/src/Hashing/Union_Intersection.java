package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Union_Intersection {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		int arr1[] = {7,3,9};
		int arr2[] = {6,3,9,2,9,4};
		
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			set.add(arr2[i]);
		}
		
		System.out.println("Union = " + set.size());
		
		System.out.print("Union values = ");
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		
		System.out.println();
		set.clear();
		
//		Intersection
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		int count = 0;
		System.out.print("Intersection values = ");
		for(int i=0; i<arr2.length; i++) {
			if(set.contains(arr2[i])) {
				count++;
				set.remove(arr2[i]);
				System.out.print(arr2[i]+ " ");
			}
		}
		System.out.println("Intersection = " + count);
	
	}
}
