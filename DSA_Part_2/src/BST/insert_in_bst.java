package BST;

import BST.insert_in_bst.Node;

public class insert_in_bst {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
//	insert data
	public static Node insert(int val, Node root) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if(root.data > val) {
			root.left = insert(val, root.left);
		}
		else {
			root.right = insert(val, root.right);
		}
		return root;
	}
//	search
	public static boolean search(Node root, int key) {
		if(root == null) {
			return false;
		}
		if(root.data == key) {
			return true;
		}
		if(root.data > key) {
			return search(root.left,key);
		}else {
			return search(root.right, key);
		}
	}
     //	   inorder
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}
	
//	delete node code
	public static Node delete(Node root, int val) {
		if(root.data < val) {
			root.right = delete(root.right,val);
		}else if(root.data > val) {
			root.left = delete(root.left,val);
		}else {
//			case 1 - leaf node
			if(root.left == null && root.right == null) {
				return null;
			}
//			case 2 - single child
			if(root.left == null) {
				return root.right;
			}else {
				return root.left;
			}
//			case 3 - to choose from both childre1n 
			Node is= findInorderSuccessor(root.right);
			root.data = is.data;
			root.right = delete(root.right,is.data);
		}
		return root;
	}
	public static Node findInorderSuccessor(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
//	print in range
	public static void PrintInRange(Node root, int k1, int k2) {
		if (root == null) {
			return;
		}
//		c1
		if(root.data>=k1 && root.data <= k2) {
			PrintInRange(root.left,k1,k2);
			System.out.print(root.data+" ");
			PrintInRange(root.right,k1,k2);
		}
		else if(root.data < k1) {
			PrintInRange(root.left,k1,k2);
		}
		else {
			PrintInRange(root.right,k1,k2);
		}
	}
	public static void main(String args[]) {
//		int values[] = {5,1,3,4,2,7};
		int values[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
		for(int i=0; i<values.length; i++) {
			root = insert(values[i], root);
		}
		inorder(root);
		System.out.println();
//		root = delete(root,1);
//		inorder(root);
		
//		if(search(root,1)) {
//			System.out.println("found");
//		}else {
//			System.out.println("Not found");
//		}
		
		PrintInRange(root,5,12);
	
	}
}
