package OOPs.Pillers.ComparingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student arpit = new Student("Arpit", 89.5f);
        Student rahul = new Student("Rahul", 56.5f);
        Student aman = new Student("Aman", 58.5f);
        Student swetank = new Student("Rahul", 72.5f);
        Student anupriya = new Student("Swetank", 99.5f);
        Student raj = new Student("Raj", 32.5f);

//        if(arpit.compareTo(rahul) > 0) {
//            System.out.println(arpit.marks + " " + rahul.marks);
//            System.out.println("Arpit has higher marks");
//            System.out.println(arpit.compareTo(rahul));
//            System.out.println(rahul.compareTo(arpit));
//        }

        Student[] list = {arpit, rahul, aman, swetank, anupriya, raj};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

    }
}
