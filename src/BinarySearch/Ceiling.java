package BinarySearch;

import java.util.Arrays;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
//        System.out.println(ceiling(arr, 19));
        System.out.println(Arrays.toString(num()));
    }
    static int ceiling(int[] arr, int target) {
        int start = 0, end = arr.length-1, mid =0;
        if(arr[end] < target) {
            return -1;
        }
        while(start < end) {
            mid = start + (end - start)/2;
            if(arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];
    }
    static int[] num() {
        return new int[]{0,0};
    }
}
