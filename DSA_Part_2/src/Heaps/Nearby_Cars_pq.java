package Heaps;

import java.util.PriorityQueue;

public class Nearby_Cars_pq {

	static class Points implements Comparable<Points>{
		int idx;
		int x;
		int y;
		int distsq;
		public Points(int idx, int x, int y, int distsq) {
			this.idx = idx;
			this.x = x;
			this.y = y;
			this.distsq = distsq;
		}
		@Override
		public int compareTo(Points p2) {
			return this.distsq - p2.distsq;
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue<Points> cars = new PriorityQueue<>();
		int arr[][] = {
				{3,3},
				{5,-1},
				{-2,4}
		};
		int k = 2;
		
		for(int i=0; i<arr.length; i++) {
			int distsq = arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
			cars.add(new Points(i, arr[i][0], arr[i][1], distsq));
		}
		
		for(int i=0; i<k; i++) {
			System.out.print("C"+cars.remove().idx);
		    System.out.println();
		}
				
	}

}
