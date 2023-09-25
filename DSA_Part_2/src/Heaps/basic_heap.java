package Heaps;

import java.util.ArrayList;

public class basic_heap {
	static class Heap{
		ArrayList<Integer> arr = new ArrayList<>();
		
		public void add(int data) { // O(log n )
//			add at last index
			arr.add(data);
			
			int x = arr.size()-1; // x is child index
			int par = (x-1)/2; // par index
			
			while(arr.get(x) < arr.get(par)) { // change to > for max heap
				int temp = arr.get(x);
				arr.set(x, arr.get(par));
				arr.set(par, temp);
				
				x=par;
				par=(x-1)/2;
			}
		}
		public int peek() {
			return arr.get(0);
		}
		public int remove() {//O(log n)
			int data = arr.get(0);
//			swap 1st and last variable
			int temp = arr.get(0);
			arr.set(0, arr.get(arr.size()-1));
			arr.set(arr.size()-1, temp);
			
//			step 2 remove
			arr.remove(arr.size()-1);
			
//			step 3
			heapify(0);
			
			return data;
			
		}
		
		private void heapify(int i) {
			int left = 2*i+1;
			int right = 2*i+2;
			int MinIdx = i;
			if(left < arr.size() && arr.get(MinIdx) > arr.get(left)) { // change to < for max heap
				MinIdx = left;
			}
			if(right < arr.size() && arr.get(MinIdx) > arr.get(right)) { // change to < for max heap
				MinIdx = right;
			}
			if(MinIdx != i) {
				int temp = arr.get(i);
				arr.set(i, arr.get(MinIdx));
				arr.set(MinIdx, temp);
				
				heapify(MinIdx);
			}
		}
		
		public boolean isEmpty() {
			return arr.size()==0;
			}
	}
	public static void main(String[] args) {
		Heap h = new Heap();
		h.add(2);
		h.add(3);
		h.add(8);
		h.add(6);
		h.add(0);
		
		while(!h.isEmpty()) {
			System.out.print(h.peek()+ " ");
			h.remove();
		}
		System.out.println();
	}

}
