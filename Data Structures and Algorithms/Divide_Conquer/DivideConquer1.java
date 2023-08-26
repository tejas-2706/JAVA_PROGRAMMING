public class DivideConquer1 {
    public static void PrintArr(int arr[], int si, int ei) {
        for (int i=si; i<=ei; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[], int si, int ei) {
       if (si>=ei) {
        return;
       }
        // last element
        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx-1); // left
        quicksort(arr, pidx+1, ei); // right
    }
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // to make place for els smaller than pivot 

        for(int j=si; j<ei; j++) {
            if(arr[j]  <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i]; // dont write pivot = arr[i] b'coz its variable
        arr[i] = temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length-1);
        PrintArr(arr, 0, arr.length-1);

    }
}
