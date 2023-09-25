package Heaps;

public class heap_sort_algo {

	public static void heapSort(int arr[]) {
//		step 1
		int n = arr.length;
		for(int i=n/2; i>=0; i--) {
			heapify(arr, i, n);
		}
		for(int i=n-1; i>0; i--) {
//			swap larget - first with last
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr,0,i);
		}
	}
	
	public static void heapify(int arr[], int i, int size) {
		int left = 2*i+1;
		int right = 2*i+2;
		int Maxidx = i;
		
		if(left < size && arr[left] > arr[Maxidx]) {
			Maxidx = left;
		}
		if(right < size && arr[right] > arr[Maxidx]) {
			Maxidx = right;
		}
		if(Maxidx != i) {
			int temp = arr[i];
			arr[i] = arr[Maxidx];
			arr[Maxidx] = temp;
			
			heapify(arr, 0, i);
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,1,5,4,3};
		heapSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
