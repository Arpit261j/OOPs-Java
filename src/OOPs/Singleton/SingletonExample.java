package OOPs.Singleton;

public class SingletonExample {
    //Singleton Class - is a class which you can create only 1 object.

    private SingletonExample() {

    }

    private static SingletonExample instance;

    public static SingletonExample getInstance() {
        if(SingletonExample.instance == null) {
            System.out.println("Creating object");
            SingletonExample.instance = new SingletonExample();
        }
        System.out.println("Returning instance");
        return instance;
    }
}
