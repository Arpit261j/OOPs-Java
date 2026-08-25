package OOPs.Pillers.Inheritance.BoxExample;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(22.2, 33.5,42.9);
        System.out.println(box.l + " " + box.h + " " + box.w);

        Box box1 = new Box(box);
        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.h + " " + boxWeight.weight);

        BoxWeight boxWeight1 = (BoxWeight) new BoxWeight(23.0,25.2);
        System.out.println(boxWeight1.l + " " + boxWeight1.h + " " + boxWeight1.w + " " + boxWeight1.weight);

        BoxWeight boxWeight2 = (BoxWeight) new BoxWeight(23.0,25.2,27.5,28.8);
        System.out.println(boxWeight2.l + " " + boxWeight2.h + " " + boxWeight2.w + " " + boxWeight2.weight);

        BoxWeight boxWeight3 = new BoxWeight(box1, 25.9234);
        System.out.println(boxWeight3.l + " " + boxWeight3.h + " " + boxWeight3.w + " " + boxWeight3.weight);

        BoxWeight boxWeight4 = new BoxWeight(boxWeight3);
        System.out.println(boxWeight4.l + " " + boxWeight4.h + " " + boxWeight4.w + " " + boxWeight4.weight);


        Box box2 = new BoxWeight(2,3,4,5);
//        System.out.println(box2.l + " " + box2.weight);

        BoxWeight box5 = new BoxWeight();
        box5.greeting();
    }
}
