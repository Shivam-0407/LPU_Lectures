package InterFaces.G2;

public class Bluetooth implements Media_Player{
    @Override
    public void start() {
        System.out.println("Music is starting in 3..2..1.. ");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopping in 3..2..1.. ");
    }
}
