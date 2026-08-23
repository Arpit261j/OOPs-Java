package OOPs.Static;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.hello();
    }

    static void fun() {
        Main main = new Main();
        main.greeting();
    }

    void greeting() {
        System.out.println("Hello");
    }
    void hello() {
        fun();
    }
}
