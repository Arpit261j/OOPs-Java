package OOPs.Pillers.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Starting MediaPlayer");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MediaPlayer");
    }
}
