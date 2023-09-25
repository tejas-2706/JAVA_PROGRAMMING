package BST;

import java.util.ArrayList;

import BST.insert_in_bst.Node;

public class Conversion_to_balance_BST {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
//	O(n)
	public static Node createBST(int arr[], int st, int end) {
		if(st>end) {
			return null;
		}
		
		int mid = (st+end)/2;
		Node root = new Node(arr[mid]);
		root.left = createBST(arr,st,mid-1);
		root.right = createBST(arr,mid+1,end);
		
		return root;	
	}
	
//	O(n)
	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
//	O(n)
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
//	O(n)

	public static void getInorder(Node root, ArrayList<Integer> inorder) {
		if(root == null) {
			return;
		}
		getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
	}
	
//	O(n)

	public static Node createBSTforBalancedBST(ArrayList<Integer> inorder, int st, int end) {
		if(st>end) {
			return null;
		}
		int mid = (st+end)/2;
		Node root = new Node(inorder.get(mid));
		root.left = createBSTforBalancedBST(inorder, st, mid-1);
		root.right = createBSTforBalancedBST(inorder, mid+1, end);
		return root;
	}
	
//	O(n)

	public static Node balanceBST(Node root) {
		ArrayList<Integer> inorder = new ArrayList<>();
		getInorder(root,inorder);
		
		root = createBSTforBalancedBST(inorder, 0, inorder.size()-1);
		return root;
	}
	
	public static void main(String[] args) {
		int arr[] = {3,5,6,8,10,11,12};
		
		
//		Node root = createBST(arr,0,6);
//		preorder(root);
		
		Node root = new Node(8);
		root.left = new Node(6);
		root.left.left = new Node(5);
		root.left.left.left = new Node(3);
		
		root.right = new Node(10);
		root.right.right = new Node(11);
		root.right.right.right = new Node(12);
		
		
		preorder(root);
		System.out.println();
		root = balanceBST(root);
		preorder(root);
		
	}

}
