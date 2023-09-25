package Hashing;
import java.util.*;
public class Count_distict_ele {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		int nums[] = {4,3,2,5,6,7,3,4,2,1};
		for (int i : nums) {
			set.add(i);
		}
		System.out.println("ans = "+set.size());
	}
}
