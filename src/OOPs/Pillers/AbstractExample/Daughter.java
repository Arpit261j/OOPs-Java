package OOPs.Pillers.AbstractExample;

public class Daughter extends Parent{

    public Daughter(int num) {
        super(num);
    }

    @Override
    void career(String name) {
        System.out.println("Daughter Career is " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Daughter Partner name is " + name +" and age is " + age);
    }
}
