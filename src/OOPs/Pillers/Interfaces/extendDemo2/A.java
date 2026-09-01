package OOPs.Pillers.Interfaces.extendDemo2;

public interface A {

    static void staticMethod() {
        System.out.println("Hi I am staticMethod");
    }

    default void fun() {
        System.out.println("I am having fun in A");
    }
}
