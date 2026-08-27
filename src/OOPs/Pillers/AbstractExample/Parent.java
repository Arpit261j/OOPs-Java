package OOPs.Pillers.AbstractExample;

public abstract class Parent {

    int num;

    Parent(Parent parent) {

    }

    Parent(int num) {
        this.num = num;
    }

    static  void hello() {
        System.out.println("Hello");
    }

    void normal() {
        System.out.println("this is normal method");
    }

    abstract void career(String name);
    abstract void partner(String name, int age);
}
