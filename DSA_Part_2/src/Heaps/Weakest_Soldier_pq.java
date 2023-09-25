package Heaps;

import java.util.PriorityQueue;

public class Weakest_Soldier_pq {

	static class Row implements Comparable<Row>{
		int idx;
		int Soldiers;
		public Row(int Soldiers, int idx) {
			this.idx = idx;
			this.Soldiers = Soldiers;
		}
		@Override
		public int compareTo(Row r2) {
			if(this.Soldiers == r2.Soldiers) {
				return this.idx - r2.idx;
			}else {
				return this.Soldiers - r2.Soldiers;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int army[][] = {
				{1,0,0,0},
				{1,1,1,1},
				{1,0,0,0},
				{1,0,0,0}};
		
		int k=2;
		
		PriorityQueue<Row> pq = new PriorityQueue<>();
		
		for(int i=0; i<army.length; i++) {
			int count = 0;
			for(int j=0; j<army[0].length; j++) {
				count += army[i][j] == 1 ? 1 : 0;
			}
			pq.add(new Row(count, i));
		}
		
		for(int i=0; i<k; i++) {
			System.out.println("Row"+pq.remove().idx);
		}
	}

}
