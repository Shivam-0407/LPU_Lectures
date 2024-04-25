package InterFaces.G1;

public class Electric_Engine implements Engine{
    @Override
    public void start() {
        System.out.println("I'll start smartly ");
    }

    @Override
    public void stop() {
        System.out.println("I'll stop smartly ");
    }

    @Override
    public void accelerate() {
        System.out.println("I'll accelerate smartly ");
    }
}
