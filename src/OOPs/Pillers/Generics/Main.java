package OOPs.Pillers.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        CustomArrayList list = new CustomArrayList();
//        list.add(55);
//        list.add(53);
//        list.add(35);
//        list.add(345);
//
//        System.out.println(list);
//        System.out.println(list.remove(3));
//        System.out.println(list);

//        CustomGenArrayList<Integer> customGenArrayList = new CustomGenArrayList<>();
//        CustomGenArrayList<String> customGenArrayList1 = new CustomGenArrayList<>();
//        CustomGenArrayList<Character> customGenArrayList2 = new CustomGenArrayList<>();
//        customGenArrayList.add(5);
//        customGenArrayList.add(6);
//        customGenArrayList1.add("ABC");
//        customGenArrayList1.add("ABCD");
//        customGenArrayList2.add('a');
//        customGenArrayList2.add('b');
//
//        System.out.println(customGenArrayList);
//        System.out.println(customGenArrayList1);
//        System.out.println(customGenArrayList2);
//
//        System.out.println(customGenArrayList.remove(1));
//        System.out.println(customGenArrayList1.remove(1));
//        System.out.println(customGenArrayList2.remove(1));
//
//        customGenArrayList.set(0,10);
//        customGenArrayList1.set(0,"ZYX");
//        customGenArrayList2.set(0,'z');
//
//        System.out.println(customGenArrayList);
//        System.out.println(customGenArrayList1);
//        System.out.println(customGenArrayList2);

        WildCardExample<Integer> obj = new WildCardExample();
        obj.add(5);
        System.out.println(obj);
    }
}
