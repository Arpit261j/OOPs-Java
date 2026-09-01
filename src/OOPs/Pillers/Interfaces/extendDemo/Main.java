package OOPs.Pillers.Interfaces.extendDemo;

public class Main implements B{

    @Override
    public void greeting() {
        System.out.println("Greeting");
    }

    @Override
    public void fun() {
        System.out.println("Fun");
    }

    public static void main(String[] args) {
        B main = new Main();
        main.greeting();
        main.fun();
    }
}
