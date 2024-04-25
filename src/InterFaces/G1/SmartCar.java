package InterFaces.G1;

import InterFaces.G2.Media_Player;

import java.util.ArrayList;
import java.util.List;

public class SmartCar {
    private Engine engine;
    private Media_Player m = new AI_Media_Player();

    SmartCar(Engine e){
        this.engine = e;
    }

    public void startCar(){
        engine.start();
    }

    public void stopCar(){
        engine.stop();
    }

    public void startMusic(){
        m.start();
    }

    public void stopMusic(){
        m.stop();
    }
}
