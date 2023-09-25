package Basics;
import java.util.*;
public class Binary_Tree_Questions {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
    public static void preorder(Node root) {
    	if(root == null) {
    		return;
    	}
    	System.out.print(root.data+" ");
    	preorder(root.left);
//    	System.out.print(root.data+" ");
    	preorder(root.right);
    }
    
//    Question 1 :
//    	Check if a Binary Tree is univalued or not We have a binary tree,
//    	the task is to check if the binary tree isunivalued or not.
//    	If found to be true, then print “YES”. Otherwise, print “NO”.
//      Sample Input 1:Sample Output 1: false
//       if every value is same in tree then it is univalued else not;
    public static boolean isUnivalued(Node root) {
    	if(root == null) { // base condition
    		return true;
    	}
    	if(root.left != null && root.data != root.left.data) {
    		return false;
    	}
    	if(root.right != null && root.data != root.right.data) {
    		return false;
    	}
    	return isUnivalued(root.left) && isUnivalued(root.right);    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		preorder(root);
		
		if(isUnivalued(root)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
