package InterFaces.G1;

public class Car implements Brake,Engine,Media{
    @Override
    public void brake() {
        System.out.println("I have normal brakes ");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car ");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car ");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normie car ");
    }
}
