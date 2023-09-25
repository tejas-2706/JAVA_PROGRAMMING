package Hashing;

import java.util.*;

public class Subarray_sumEquals_K {
	public static void main(String[] args) { // T.C = O(n)
		HashMap<Integer, Integer> map = new HashMap<>();
		int arr[] = {10,2,-2,-20,10};
		int k = -10;
		
		int sum = 0;
		int count = 0;
		
		map.put(0, 1); // sum and freq
		
		for(int j=0; j<arr.length; j++) {
			sum = sum + arr[j];
			if(map.containsKey(sum-k)) {
				count = count + map.get(sum-k);
			}else {
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}
		}
		
		System.out.print(count);
	}
}
