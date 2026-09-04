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

    public static void main(String[] args) {
//        Given calendars of multiple employees:
//        A : [9-10], [13-14]Test
//        B : [10-11], [14-15]
//        C : [11-12]
//
//        Find a free slot of 30 minutes for everyone.

        Test test = new Test();
        System.out.println(Arrays.toString(test.twoSum(new int[]{3,5,9,10}, 19)));

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.reverse();

    }
}

