import java.util.*;

public class Test {
//    public static int fib(int n) {
//        int f = 0, s = 1, t = 0;
//        for(int i = 2; i < n; i++) {
//            t = f+s;
//            f = s;
//            s = t;
//        }
//        return t;
//    }

    public static void main(String[] args) {
        int a = 5, b = 4;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a + ", b = " + b);
    }
}

