package InterFaces.G2;

public class SmartCar {
    private Engine engine;
    private Media_Player m = new Bluetooth();

    public SmartCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void musicStart(){
        m.start();
    }

    public void musicStop(){
        m.stop();
    }

}
