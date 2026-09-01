import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public int mySqrt(int x) {
        if(x == 1 || x == 2 || x == 3)  return 1;
        int l = 2, r = x/2, ans = 0;
        while(l <= r) {
            long mid = l + (r - l)/2;
            if (mid*mid > x) r = (int)mid-1;
            else if (mid*mid < x) {
                ans = (int)mid;
                l = (int)mid+1;
            }
            else {
                return (int)mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        Given calendars of multiple employees:
//        A : [9-10], [13-14]
//        B : [10-11], [14-15]
//        C : [11-12]
//
//        Find a free slot of 30 minutes for everyone.

        Test test = new Test();
        System.out.println(test.mySqrt(2147395599));

    }
}

