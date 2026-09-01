package OOPs.Pillers.Interfaces;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.PRICE + " " + Engine.PRICE); //PRICE is static variable
        // so calling through object and interface name also.
//        car.start();
//        car.stop();
//        car.accelerate();
//        car.brake();
//
//
//        CDPlayer play = new CDPlayer();
//        play.start();
//        play.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stop();
        niceCar.startMusic();
        niceCar.stopMusic();

        NiceCar niceCar1 = new NiceCar(new ElectricEngine(), new CDPlayer());
        niceCar1.start();
        niceCar1.startMusic();
        niceCar1.stop();
        niceCar1.stopMusic();
    }
}
