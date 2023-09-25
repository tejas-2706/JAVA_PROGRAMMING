package Heaps;

import java.util.PriorityQueue;

public class Sliding_Win_Max_pq {

	static class Pair implements Comparable<Pair>{
		int val;
		int idx;
		public Pair(int val, int idx) {
			this.val = val;
			this.idx = idx;
		}
		@Override
		public int compareTo(Pair p2) {
//			ascending order
//			return this.val - p2.val;
//			decending order
			return p2.val - this.val;
		}
	}
	public static void main(String[] args) {

		int arr[] = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int res[] = new int[arr.length-k+1]; 
		
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			pq.add(new Pair(arr[i], i));
		}
		
		res[0] = pq.peek();
		
		for()
		
	}

}
