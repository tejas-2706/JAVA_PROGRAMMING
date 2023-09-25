package Heaps;

import java.util.PriorityQueue;

public class ConnectN_Ropes {

	public static void main(String[] args) {
		int ropes[] = {4,3,3,2,6};
		
		int cost = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<ropes.length; i++) {
			pq.add(ropes[i]);
		}
		
		while(pq.size() > 1) {
			int min = pq.remove();
			int min2 = pq.remove();
			cost = cost+min+min2;
			pq.add(min+min2);
		}
		
		System.out.print("Cost is  = "+cost);
	}

}
