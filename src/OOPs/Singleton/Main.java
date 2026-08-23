package OOPs.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        SingletonExample obj3 = SingletonExample.getInstance();

        // all 3 variables are pointing to just 1 object.
    }
}
