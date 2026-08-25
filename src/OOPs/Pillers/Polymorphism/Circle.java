package OOPs.Pillers.Polymorphism;

public class Circle extends Shapes{
    int r;

    Circle(int r) {
        this.r = r;
    }
    Circle() {
    }

    @Override
    void area(){
        System.out.println("Area = " + 3.14*r*r);
        System.out.println("Circle area pie * radius square");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
