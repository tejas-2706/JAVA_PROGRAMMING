public class DivideConquer2 {
    public static int search(int arr[], int tar, int si, int ei) {
        // Base case
        if (si > ei) {
            return -1;
        }
        // kaam
        int mid = (si+ei)/2;

        // case found
        if (tar == arr[mid]) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]){
            if (arr[si] <= tar && tar <= arr[mid-1]) {
            // left 
                return search(arr, tar, si, mid-1);
            }
            else {
            // right
                return search(arr, tar, mid+1, ei);
            }
        }
        // mid on L2
        else {
            if (arr[mid+1] <= tar && tar <= arr[ei]) {
            // right
                return search(arr, tar, mid+1, ei);
            }
            else {
            // left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ser = search(arr, target, 0, arr.length-1);
        System.out.println(ser);
    }
}
