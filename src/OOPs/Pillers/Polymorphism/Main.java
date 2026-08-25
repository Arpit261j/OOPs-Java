package OOPs.Pillers.Polymorphism;

public class Main {
    public static void main(String[] args) {

        //Note -> Whichever Object is being created (not reference variable) only that function will gets called
        Shapes shape = new Shapes();
        shape.area();

        Shapes shapes = new Circle(2);
//        System.out.println(shapes.r);  // this is an error reference variable is of type shapes
        // so it can only call its variable
        //Where if area is present in both then child function area will ge called.
        shapes.area();

        Circle shapes2 = new Circle();
        shapes2.area();
        System.out.println(shapes2);
    }
}
