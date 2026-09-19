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

//    public int[] productExceptSelf(int[] nums) {
//        int product = 1, count = 0;
//        for(int i = 0; i < nums.length; i++) {
//            product *= nums[i];
//            if(nums[i] == 0)    count++;
//        }
//
//        if(count > 1)   return new int[nums.length];
//
//        if(count == 1) {
//            int productWithZero = 1, index = 0;
//            for(int i = 0; i < nums.length; i++) {
//                if(nums[i] == 0) {
//                    index = i;
//                    continue;
//                }
//                productWithZero *= nums[i];
//            }
//            int[] ans = new int[nums.length];
//            ans[index] = productWithZero;
//            return ans;
//        }
//        int[] finalAns = new int[nums.length];
//        for(int i = 0; i < nums.length; i++) {
//            finalAns[i] = product/nums[i];
//        }
//        return finalAns;
//    }

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

//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        HashSet<List<Integer>> set = new HashSet();
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i = 0; i < nums.length; i++) {
//            int j = i+1, k = nums.length-1;
//            while(j < k) {
//                int sum = nums[i] + nums[j] + nums[k];
//                if(sum == 0) {
//                    if(!set.contains(Arrays.asList(nums[i], nums[j], nums[k]))) {
//                        set.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    }
//                    j++;
//                }
//                else if (sum > 0)   k--;
//                else j++;
//            }
//        }
//        return list;
//    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList();
//        for(int i = 0; i < nums.length-2; i++) {
//            if(i > 0  && nums[i] == nums[i-1])  continue; //while???????
//            int j = i+1, k = nums.length-1;
//            while(j < k) {
//                int sum = nums[i] + nums[j] + nums[k];
//                if(sum == 0) {
//                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    j++;
//                    k--;
//
//                    while(j < k && nums[j] == nums[j-1])    j++;
//                    while(j < k && nums[k] == nums[k+1])    k--;
//                }
//                else if(sum < 0) {
//                    j++;
//                }
//                else {
//                    k--;
//                }
//            }
//        }
//        return ans;
//    }

//    public int lengthOfLongestSubstring(String s) {
//        int index = 0, maxCount = 0;
//        for(int j = 1; j < s.length(); j++) {
//            int i = index, count = 1;
//            while(i < j) {
//                if(s.charAt(i) == s.charAt(j)) {
//                    index = i+1;
//                    maxCount = Math.max(maxCount, count);
//                    break;
//                }
//                count++;
//                maxCount = Math.max(maxCount, count);
//                i++;
//            }
//        }
//        return maxCount;
//    }

//    public int lengthOfLongestSubstring(String s) {
//        if(s.length() == 0 || s.length() == 1)    return s.length();
//        HashMap<Character, Integer> map = new HashMap();
//        int maxCount = 0, count = 0, j = 0, i = 0 ;
//        while(j < s.length()) {
//            if(!map.containsKey(s.charAt(j))) {
//                map.put(s.charAt(j), j);
//                count++;
//                j++;
//                maxCount = Math.max(count, maxCount);
//            }
//            else {
//                int idx = map.get(s.charAt(j));
//                while (i <= idx) {
//                    map.remove(s.charAt(i));
//                    i++;
//                    count--;
//                }
//            }
//        }
//        return maxCount;
//    }

//    public int lengthOfLongestSubstring(String s) {
//        int maxLen = Integer.MIN_VALUE, count = 0;
//        HashMap<Character, Integer> map = new HashMap();
//        int l = 0, r = 0;
//        while(r < s.length()) {
//            if(!map.containsKey(s.charAt(r))) {
//                count++;
//            }
//            else {
//                if(map.get(s.charAt(r)) < l) {
//                    count++;
//                }
//                else {
//                    l = map.get(s.charAt(r)) + 1;
//                    count = r - l +1;
//                }
//            }
//            map.put(s.charAt(r), r);
//            maxLen = Math.max(count, maxLen);
//            r++;
//        }
//        return maxLen;
//    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)   return 0;
        HashMap<Character, Integer> map = new HashMap();
        int l = 0, r = 0, len = Integer.MIN_VALUE;
        while(r < s.length()) {
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l) {
                l = map.get(s.charAt(r))+1;
            }
            map.put(s.charAt(r),r);
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE, sum = 0;
        int l = 0, r = 0;
        while(r <= nums.length-1) {
            sum+= nums[r];
            r++;
            while(sum >= target) {
                len = Math.min(len, r - l);
                sum-= nums[l];
                l++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }

    public boolean checkInclusion(String s1, String s2) {
//        if(s1.length() < s2.length()) {
//            String temp = s1;
//            s1 = s2;
//            s2 = temp;
//        }
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        int i = 0, j = 0;
        while(j < char2.length && char1[i] != char2[j]) j++;
        while(j < char2.length-1 && i < char1.length-1) {
            if(char1[++i] == char2[++j]) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, idx1 = 0, idx2 = 0, maxLen = Integer.MIN_VALUE;
        while(l < nums.length && nums[l] != 0) {
            l++;
            r++;
        }
        idx1 = l;
        int countZero = 0;
        while(r < nums.length && countZero < k) {
            if(nums[r] == 0) {
                countZero++;
            }
            r++;
        }
        r--;
        while(r < nums.length) {
            idx2 = r+1;
            while(idx2 < nums.length && nums[idx2] != 0) {
                idx2++;
            }
            if(l == idx1)   {
                maxLen = Math.max(maxLen, idx2);
            }
            else {
                maxLen = Math.max(maxLen, idx2 - idx1 -1);
            }
            idx1 = l;
            l++;
            while(l < nums.length && nums[l] != 0) {
                l++;
            }
            r = idx2;
        }
        return maxLen;
    }

//    public int totalFruit(int[] arr) {
//        int l = 0, maxLen = 0;
//        HashMap<Integer,Integer> map = new HashMap();
//        for(int r = 0; r < arr.length; r++) {
//            map.put(arr[r], map.getOrDefault(arr[r],0) + 1);
//            while(map.size() > 2) {
//                map.put(arr[l], map.get(arr[l])-1);
//                l++;
//
//                if(map.get(arr[l-1]) == 0) {
//                    map.remove(arr[l-1]);
//                }
//            }
//            maxLen = Math.max(maxLen, r-l+1);
//        }
//        return maxLen;
//    }

    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length-1] = height[height.length-1];
        int trappedWater = 0;
        for(int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        for(int i = height.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        for(int i = 1; i < height.length-1; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return trappedWater;
    }

    public int characterReplacement(String s, int k) {
        int maxLen= 0, maxFreq = 0, l = 0;
        HashMap<Character, Integer> map = new HashMap();
        for(int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));

            while((l <= r) && (r-l+1 - maxFreq > k)) {
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
                maxFreq = Collections.max(map.values());
            }
            maxLen = Math.max(r-l+1, maxLen);
        }
        return maxLen;
    }

//    public int subarraySum(int[] nums, int k) {
//        int count = 0, pSum = 0;
//        HashMap<Integer, Integer> map = new HashMap();
//        for(int i = 0; i < nums.length; i++) {
//            map.put(pSum, map.getOrDefault(pSum,0) + 1);
//            pSum+= nums[i];
//            if(map.containsKey(pSum-k)) {
//                count+= map.get(pSum-k);
//            }
//        }
//        return count;
//    }

    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap();
        int  l = 0, len = Integer.MIN_VALUE;
        for(int r = 0; r < fruits.length; r++) {
            map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);
            while(map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }
            len = Math.max(len, r-l+1);
        }
        return len;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            arr1[i] = arr1[i-1]*nums[i-1];
        }
        arr2[nums.length-1] = 1;
        for(int i = nums.length-2; i>= 0; i--) {
            arr2[i] = arr2[i+1]*nums[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = arr1[i]*arr2[i];
        }
        return nums;
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int pSum = 0;
        map.put(pSum%k, -1);
        for(int i = 0; i < nums.length; i++) {
            pSum+= nums[i];
            if(map.containsKey(pSum % k) && i-map.get(pSum%k) >=2) {
                return true;
            }
            map.put(pSum%k, i);
        }
        return false;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        HashMap<Character, Integer> map = new HashMap();
        for(int i = 0; i< s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i< s.length(); i++) {
            if(!map.containsKey(t.charAt(i)))  return false;
            map.put(t.charAt(i), map.get(t.charAt(i))-1);
            if(map.get(t.charAt(i)) < 0) return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList();
        HashSet<String> set = new HashSet();

        for(int i = 0; i < strs.length; i++) {
            List<String> list = new ArrayList();
            if(set.contains(strs[i]))   continue;
            set.add(strs[i]);
            list.add(strs[i]);
            for(int j = i+1; j < strs.length; j++) {
                if(isAnagram(strs[i],strs[j])) {
                    set.add(strs[j]);
                    list.add(strs[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int count = 0, max = 0;
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int num : set) {
            if(!set.contains(num-1)) {
                int x = num;
                count = 0;
                while(set.contains(x)) {
                    count++;
                    x++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }

    public int majorityElement(int[] nums) {
        int ans = nums[0], count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                ans = nums[i];
                count++;
                continue;
            }
            if(nums[i] == ans) {
                count++;
            }
            else {
                count--;
            }
        }
        return ans;
    }

    public int longestSubarray(int[] nums) {
        int l = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int r= 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);
            int freq = map.get(1) == null ? 0 : map.get(1);
            while(r-l+1-freq > 1) {
                map.put(nums[l], map.get(nums[l])-1);
                l++;
            }
            maxLen = Math.max(maxLen, r-l);
        }
        return maxLen;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++) {
            int j = i+1, k = nums.length-1;
            while(j < k) {
                List<Integer> list = new ArrayList();
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        int count = 0, pSum = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i++) {
            pSum+= nums[i];
            if( map.containsKey(pSum-k))
                count+= map.get(pSum-k);
            map.put(pSum, map.getOrDefault(pSum,0)+1);
        }
        return count;
    }



    public static void main(String[] args) {
        Test1 test1 = new Test1();
//        System.out.println(test1.maxProfit(new int[]{7,6,4,21,12,15,19,1}));
//        System.out.println(Arrays.toString(test1.productExceptSelf(new int[] {1,2,3,4})));
//        System.out.println(test1.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
//        System.out.println(test1.removeDuplicates(new int[]{1,1,2}));
//        System.out.println('Z' + 0);
//        System.out.println(test1.isPalindrome("A man, a plan, a canal: Panama"));
//        String s = "Ab bc";
//        s.split(" ");
//        System.out.println(s);
//        System.out.println(" " + 0);
//        System.out.println(test1.threeSum(new int[] {-1,0,1,2,-1,-4}));
//        System.out.println(test1.minSubArrayLen(11, new int[] {1,2,3,4,5}));
//        System.out.println(test1.checkInclusion("ab","eidbaooo"));
//        System.out.println(test1.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(test1.totalFruit(new int[] {1,2,3,2,2}));
//        System.out.println(test1.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
//        System.out.println(test1.characterReplacement("ABAB", 2));
//        System.out.println(test1.totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));
//        System.out.println(test1.checkSubarraySum(new int[] {23,6,9}, 6));
//        System.out.println(test1.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
//        System.out.println(test1.majorityElement(new int[]{6,5,5}));
//        System.out.println(test1.longestConsecutive(new int[]{100,4,1,3,2}));
//        System.out.println(test1.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
//        System.out.println(test1.subarraySum(new int[]{1,2,3,-3,4,2}, 6));
        System.out.println(test1.threeSum(new int[]{-100,-70,-60,110,120,130,160}));
    }
}

