package Tries;

import Tries.basic_tries.Node;

public class StartsWithPrefix_Problem {
	static class Node{
		Node children[] = new Node[26];
		boolean eow = false;
		
		Node(){
			for(int i=0; i<26; i++) {
				children[i] = null;
			}
		}
	}
	public static Node root = new Node(); 
	public static void insert(String word) { //O(L) - largest word length
		Node curr = root;
		for(int level = 0; level < word.length(); level++) {
			int idx = word.charAt(level) - 'a';
			if(curr.children[idx] == null) {
				curr.children[idx] = new Node();
			}
			curr = curr.children[idx];
		}
		
		curr.eow = true;
	}
	
	public static boolean StartsWith(String Prefix) { //O(L) - largest word length
		Node curr = root;
		for(int level = 0; level < Prefix.length(); level++) {
			int idx = Prefix.charAt(level) - 'a';
			if(curr.children[idx] == null) {
				return false;
			}
			curr = curr.children[idx];
		}
		return true;
	}
	
	public static void main(String[] args) {		
		String arr[] = {"apple", "app", "mango", "man", "woman"};
		for(int i=0; i<arr.length; i++) {
			insert(arr[i]);
		}
		System.out.print(StartsWith("ap"));
		
	}
}
