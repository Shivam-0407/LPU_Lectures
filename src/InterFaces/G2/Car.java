package InterFaces.G2;

public class Car implements Brake,Engine,Media_Player{
    @Override
    public void brake() {
        System.out.println("I'll put brakes like a normie Car");
    }

    @Override
    public void start() {
        System.out.println("I'll start like a normie Car");
    }

    @Override
    public void stop() {
        System.out.println("I'll  stop like a normie Car");
    }
}
