package BinarySearch;

public class Binary_Search {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7};
        System.out.println(search(A, 6));
    }

    static int search(int [] arr, int target) {
        int start = 0, end = arr.length-1, mid = 0;
        while(start <= end) {
            mid = start +(end - start)/2;
            if(arr[mid] >target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
