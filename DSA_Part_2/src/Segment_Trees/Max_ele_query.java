package Segment_Trees;

public class Max_ele_query {
	static int tree[];
	public static void init(int n) {
		tree = new int[4*n];
	}
//	O(n)
	public static void buidTree(int i, int si, int sj, int arr[]) {
		if(si==sj) {
			tree[i] = arr[si];
			return;
		}
		int mid = (si+sj)/2;
		buidTree(2*i+1, si, mid, arr);
		buidTree(2*i+2, mid+1, sj, arr);
		
		tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
	}
//	O(logn)
	public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
		if(si>qj || sj<qi) {
			return Integer.MIN_VALUE;
		}else if(si>=qi && sj<=qj) {
			return tree[i];
		}else {
			int mid = (si+sj)/2;
			int leftans = getMaxUtil(2*i+1, si, mid, qi, qj);
			int rightans = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
			return Math.max(leftans, rightans);
		}
	}
	public static int getMax(int arr[], int qi, int qj) {
		int n = arr.length;
		return getMaxUtil(0,0,n-1,qi,qj);
	}
//	O(logn)
	public static void UpdateUtil(int i, int si, int sj, int idx, int newVal) {
		if(idx<si || idx>sj) {
			return;
		}

		if(si==sj) {
			tree[i] = newVal;
		}
		if(si!=sj) {
			tree[i] = Math.max(tree[i], newVal);
			int mid = (si+sj)/2;
			UpdateUtil(2*i+1, si, mid, idx, newVal);
			UpdateUtil(2*i+2, mid+1, sj, idx, newVal);
		}
	}
	public static void Update(int arr[],int idx, int newVal) {
		int n = arr.length;
		arr[idx] = newVal;
		UpdateUtil(0, 0, n-1, idx, newVal);
	}
	public static void main(String[] args) {
		int arr[] = {6,8,-1,2,17,1,3,2,4};
		int n = arr.length;
		init(n);
		buidTree(0, 0, n-1, arr);
		for(int i=0; i<tree.length; i++) {
			System.out.print(tree[i]+" ");
		}
		System.out.println();
		System.out.println("Max of arr = "+ tree[0]);
				
		int max = getMax(arr,2,5);
		System.out.println("Max between range = " + max);
		
		Update(arr, 2, 20);
		
		max = getMax(arr,2,5);
		System.out.println("Max between range when updated = " + max);

//		
//		for min just change -infinity to +infinity
//		And change all max to min.....
//		
		
		while(ans != q) {
			
		}
		
	}
}
