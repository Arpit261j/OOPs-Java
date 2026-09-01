package OOPs.Pillers.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;

    NiceCar() {
        this.engine = new PowerEngine();
        this.media = new CDPlayer();
    }

    NiceCar(Engine engine, Media media) {
        this.engine = engine;
        this.media = media;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

}
