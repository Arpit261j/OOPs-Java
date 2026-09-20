import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        map.put(nums[0],0);
        for(int i = 1; i < nums.length; i++) {
            if(map.containsKey(target-nums[i]))    return new int[]{map.get(target-nums[i]),i};
            else    map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

    public void Pass(int[] nums) {
        int[] arr = {10, 20, 30};
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
    }

    public int binarySearch(int[] nums, int target, int l, int r) {
        while(l <= r) {
            int mid = (r-l)/2 + l;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) r = mid-1;
            else    l = mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l = 0, r= nums.length-1, pivot = 0;
        while(l < r) {
            int m = (r-l)/2 + l;
            if(m < nums.length-1 && nums[m] > nums[m+1]) {
                pivot = m;
                break;
            }
            if(m > 0 && nums[m] < nums[m-1]){
                pivot = m-1;
                break;
            }
            if(nums[l] >= nums[m])
                r = m;
            else if(nums[r] <= nums[m])
                l = m;
            else {
                return binarySearch(nums, target, l, r);
            }
        }
        l = 0;
        r = nums.length-1;
        if(target >= nums[l] && target <= nums[pivot])   return binarySearch(nums,target,l,pivot);
        if(target <= nums[pivot+1] && target <= nums[r]) return binarySearch(nums, target, pivot+1, r);
        return -1;
    }

    public int findMin(int[] nums) {
        if(nums.length == 1)    return nums[0];
        int l = 0, r = nums.length-1;
        while(l < r) {
            int m = (r-l)/2 + l;
            if(m < nums.length-1 && nums[m] > nums[m+1]) {
                return nums[m+1];
            }
            if(m > 0 && nums[m] < nums[m-1]){
                return nums[m];
            }
            if(nums[l] >= nums[m])
                r = m;
            else if(nums[r] <= nums[m])
                l = m;

            else {
                return nums[0];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Given calendars of multiple employees:
//        A : [9-10], [13-14]Test
//        B : [10-11], [14-15]
//        C : [11-12]
//
//        Find a free slot of 30 minutes for everyone.

        Test test = new Test();
//        System.out.println(Arrays.toString(test.twoSum(new int[]{3,5,9,10}, 19)));
//        StringBuilder sb = new StringBuilder();
//        sb.append("A");
//        sb.append("B");
//        sb.reverse();
//        int[] nums = new int[] {1,2,3,4};
//        test.Pass(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(test.search(new int[]{1,3,5},0));
//        System.out.println(test.findMin(new int[]{3,4,5,1,2}));
        System.out.println(test.findMin(new int[]{1,2}));
    }
}

