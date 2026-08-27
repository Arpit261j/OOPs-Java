package OOPs.Pillers.Interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("normal brake");
    }

    @Override
    public void start() {
        System.out.println("normal start");
    }

    @Override
    public void stop() {
        System.out.println("normal stop");
    }

    @Override
    public void accelerate() {
        System.out.println("normal accelerate");
    }
}
