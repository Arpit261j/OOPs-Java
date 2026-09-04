import java.util.*;

public class Test1 {

    public int maxProfit(int[] nums) {
        int min = Integer.MAX_VALUE, max = 0;
        for(int i =1; i < nums.length; i++) {
            min = Math.min(nums[i-1], min);
            int profit = nums[i] - min;
            max = Math.max(max, profit);
        }
        return max;
    }

    public int[] productExceptSelf(int[] nums) {
        int product = 1, count = 0;
        for(int i = 0; i < nums.length; i++) {
            product *= nums[i];
            if(nums[i] == 0)    count++;
        }

        if(count > 1)   return new int[nums.length];

        if(count == 1) {
            int productWithZero = 1, index = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    index = i;
                    continue;
                }
                productWithZero *= nums[i];
            }
            int[] ans = new int[nums.length];
            ans[index] = productWithZero;
            return ans;
        }
        int[] finalAns = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            finalAns[i] = product/nums[i];
        }
        return finalAns;
    }

    public int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            currSum = currSum < 0 ? 0 : currSum;
        }
        return maxSum;
    }

    public int removeDuplicates(int[] nums) {
        int k = 0, i = 1, j = 0;
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        while(i != nums.length) {
            if(arr[j] != nums[i]) {
                j++;
                arr[j] = nums[i];
                k++;
            }
            i++;
        }
        System.out.println(arr);
        return k;
    }

    public boolean isPalindrome(String s) {
        s =  s.toLowerCase();
        int i = 0, j = s.length()-1;
        while(i < j) {
            while((i < j) && !((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i) >= '0' && s.charAt(i) <= '9')))    {
                i++;
            }
            while((i < j) && !((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') ||
                    (s.charAt(j) >= '0' && s.charAt(j) <= '9')))    {
                j--;
            }
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

//    public List<List<Integer>> threeSum(int[] nums) {
////        Arrays.sort(nums);
//        HashSet<List<Integer>> set = new HashSet();
//        List<List<Integer>> ans = new ArrayList();
//        for(int i = 0; i < nums.length-2; i ++) {
//            for(int j = i+1; j < nums.length-1; j++) {
//                for(int k = j+1; k < nums.length; k++) {
//                    if(nums[i] + nums[j] + nums[k] == 0) {
//                        if(!set.contains(Arrays.asList(nums[i],nums[j],nums[k]))) {
//                            set.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                            ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                        }
//                    }
//                }
//            }
//        }
//        return ans;
//    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> list = new ArrayList();
//        HashSet<List<Integer>> set = new HashSet();
//        for(int i = 0; i < nums.length-1; i++) {
//            HashMap<Integer, Integer> map = new HashMap();
//            for(int j = i+1; j < nums.length; j++) {
//                if(map.containsKey(-(nums[i] + nums[j]))) {
//                    List<Integer> temp = Arrays.asList(nums[i], nums[j], -(nums[i]+nums[j]));
//                    Collections.sort(temp);
//                    if(!set.contains(temp)) {
//                        set.add(temp);
//                        list.add(temp);
//                    }
//                }
//                map.put(nums[j],j);
//            }
//        }
//        return list;
//    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int j = i+1, k = nums.length-1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    if(!set.contains(Arrays.asList(nums[i], nums[j], nums[k]))) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                    j++;
                }
                else if (sum > 0)   k--;
                else j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
//        System.out.println(test1.maxProfit(new int[]{7,6,4,21,12,15,19,1}));
//        System.out.println(Arrays.toString(test1.productExceptSelf(new int[] {0,1,0,-3,3})));
//        System.out.println(test1.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
//        System.out.println(test1.removeDuplicates(new int[]{1,1,2}));
//        System.out.println('Z' + 0);
//        System.out.println(test1.isPalindrome("A man, a plan, a canal: Panama"));
//        String s = "Ab bc";
//        s.split(" ");
//        System.out.println(s);
//        System.out.println(" " + 0);
        System.out.println(test1.threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
}

