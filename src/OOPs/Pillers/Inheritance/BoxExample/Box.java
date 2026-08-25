package OOPs.Pillers.Inheritance.BoxExample;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box box) {
        this.l = box.l;
        this.h = box.h;
        this.w = box.w;
    }

    static void greeting(){
        System.out.println("hello, I am in Box");
    }

    public void displayInfo() {
        System.out.println("Displaying Box");
    }
}
