package InterFaces.G2;

public class Electric implements Engine{
    @Override
    public void start() {
        System.out.println("I'll start in a smart way ");
    }

    @Override
    public void stop() {
        System.out.println("I'll stop in a smart way");
    }
}
