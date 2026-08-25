package OOPs.Pillers.Inheritance.BoxExample;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double weight, double side){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(Box box, double weight) {
        super(box);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = 20;
    }

//    @Override
    static void greeting() {
        System.out.println("Hello, I am in BoxWeight!!!");
    }
}
