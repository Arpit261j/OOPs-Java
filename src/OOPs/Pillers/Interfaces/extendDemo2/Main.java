package OOPs.Pillers.Interfaces.extendDemo2;

public class Main implements A,B {

    @Override
    public void greeting() {
        System.out.println("Greeting");
    }

    public static void main(String[] args) {
        Main a = new Main();
        a.fun();
        a.greeting();
        A.staticMethod();
    }
}
