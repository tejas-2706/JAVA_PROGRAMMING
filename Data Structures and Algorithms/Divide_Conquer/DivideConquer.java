
public class DivideConquer {
    public static void PrintArr(int arr[]) {
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei) {
        // Base
        if (si>=ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si)/2; // or (si + ei)/2
        mergeSort(arr, si, mid);   // left part
        mergeSort(arr, mid+1, ei);  // right part
       
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        // e.q -> left(0,3)=4; right(4,6)=3; --> 6-0+1;
        int temp[] = new int[ei-si+1];
        int i = si; // left part
        int j = mid+1; // right part
        int k = 0; // temp array

        while (i <= mid && j <= ei) {
            if (arr[i]< arr[j]) {
                temp[k] = arr[i];
                i++; k++;
            }
            else {
                temp[k] = arr[j];
                j++; k++;
            }
        }

        //  left part
        while (i <= mid) {
            temp[k++] = arr[i++];  // k then increment of k i.e k++, same for j
        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k=0, i=si; k<=temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    
    }
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        System.out.println("\n sorted array");
        PrintArr(arr);
    }
}





// public class DivideConquer {
//     public static void PrintArr(int arr[]) {
//         for (int i=0; i<=arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void mergeSort(int arr[], int si, int ei) {
//         // Base
//         if (si>=ei) {
//             return;
//         }
//         // if (si == ei) {
//         //     return;
//         // }
//         // kaam
//         int mid = si + (ei - si)/2; // or (si + ei)/2
//         mergeSort(arr, si, mid);   // left part
//         mergeSort(arr, mid+1, ei);  // right part
       
//         merge(arr, si, mid, ei);
//     }
//     public static void merge(int arr[], int si, int mid, int ei) {
//         // e.q -> left(0,3)=4; right(4,6)=3; --> 6-0+1;
//         int temp[] = new int[ei-si+1];
//         int i = si; // left part
//         int j = mid+1; // right part
//         int k = 0; // temp array

//         while (i <= mid && j <= ei) {
//             if (arr[i]< arr[j]) {
//                 temp[k] = arr[i];
//                 i++; 
//             }
//             else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         //  left part
//         while (i <= mid) {
//             temp[k++] = arr[i++];  // k then increment of k i.e k++, same for j
//         }
//         // right part
//         while (j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         // copy temp to original array
//         for (k=0, i=si; k<=temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
    
//     }
//     public static void main(String args[]) {
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         mergeSort(arr, 0, arr.length-1);
//         PrintArr(arr);
//     }
// }




/* Java program for Merge Sort */
class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra */