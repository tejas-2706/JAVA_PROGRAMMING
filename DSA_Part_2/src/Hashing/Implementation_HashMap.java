package Hashing;
import java.util.*;
import java.util.LinkedList;

public class Implementation_HashMap {
	static class HashMap<K,V>{
		private class Node{
			K key;
			V value;
			public Node(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}
		private int n; 
		private int N; // N = buckets.length;
		private LinkedList<Node> buckets[];
		
		@SuppressWarnings(value = { "Unchecked" })
		public HashMap() {
			this.N = 4;
			this.buckets = new LinkedList[4];
			for(int i=0; i<4; i++) {
				this.buckets[i] = new LinkedList<>();
			}
		}
		
		private int hashFunction(K key) {
			int hc = key.hashCode();
			return Math.abs(hc) % N;
		}
		
		private int SearcnInLL(K key, int bi) {
			LinkedList<Node> ll = buckets[bi];
			int di = 0;
			for(int i = 0; i<ll.size(); i++) {
				Node node = ll.get(i);
				if(node.key == key) {
					return di;
				}
				di++;
			}
			return -1;
		}
		
		@SuppressWarnings
		private void rehash() {
			LinkedList<Node> oldBucket[] = buckets;
			buckets = new LinkedList[N*2];
			N = 2*N;
			for(int i=0; i<buckets.length; i++) {
				buckets[i] = new LinkedList<>();
			}
			
			for(int  i=0; i<oldBucket.length; i++) {
				LinkedList<Node> ll = oldBucket[i];
				for(int j=0; j<ll.size(); j++) {
					Node node = ll.remove();
					put(node.key, node.value);
				}
			}
		}
		
		public void put(K key, V value) {
			int bi = hashFunction(key);
			int di = SearcnInLL(key, bi);
			
			if(di != -1) {
				Node node = buckets[bi].get(di);
				node.value = value;
			}else {
				buckets[bi].add(new Node(key,value));
				n++;
			}
			double lambda = (double) n/N;
			if(lambda > 2.0) {
				rehash();
			}
		}
		
		public boolean containsKey(K key) {
			int bi = hashFunction(key);
			int di = SearcnInLL(key, bi);
			
			if(di != -1) {
				return true;
			}else {
				return false;
			}
		}
		
		public V get(K key) {
			int bi = hashFunction(key);
			int di = SearcnInLL(key, bi);
			
			if(di != -1) {
				Node node = buckets[bi].get(di);
				return node.value;
			}else {
				return null;
			}
		}
		
		public V remove(K key) {
			int bi = hashFunction(key);
			int di = SearcnInLL(key, bi);
			
			if(di != -1) {
				Node node = buckets[bi].remove(di);
				return node.value;
			}else {
				return null;
			}
		}
		
		public ArrayList<K> keySet(){
			ArrayList<K> keys = new ArrayList<>();
			for(int i=0; i<buckets.length; i++) {
				LinkedList<Node> ll = buckets[i];
				for(Node node :ll) {
					keys.add(node.key);
				}
			}
			return keys;
		}
		
		public boolean isEmpty() {
			return n == 0;
		}
		
		public int size() {
			return n; // how many nodes , key-value pair
		}
		public static void main(String[] args) {
			
			HashMap<String,Integer> hm = new HashMap<>();
			hm.put("India", 150);
			hm.put("usa", 100);
			hm.put("china", 200);
			hm.put("Russia", 50);
			hm.put("UAE", 20);
			ArrayList<String> keys = hm.keySet();
			for (String key : keys) {
				System.out.println(key);
			}
			
			System.out.println(hm.get("India"));

			System.out.println(hm.containsKey("Indonesia"));

			System.out.println(hm.remove("china"));

			System.out.println(hm.size());
			
			System.out.println(hm.isEmpty());

		}
	}
}
