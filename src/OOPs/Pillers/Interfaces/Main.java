package OOPs.Pillers.Interfaces;

public class Main {
    public static void main(String[] args) {
        Media media = new Car();
        media.start();

        Car car = new Car();
        System.out.println(car.PRICE + " " + Engine.PRICE); //PRICE is static variable
        // so calling through object and interface name also.
        car.start();
        car.stop();
        car.accelerate();
        car.brake();
    }
}
