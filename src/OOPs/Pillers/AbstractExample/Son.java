package OOPs.Pillers.AbstractExample;

public class Son extends Parent{

    public Son(int num) {
        super(num);
    }

    @Override
    void career(String name) {
        System.out.println("Career is " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Partner name is " + name +" and age is " + age);
    }

}
