package InterFaces.G2;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println(" Let the power talk....");
    }

    @Override
    public void stop() {
        System.out.println(" Please let the power talk more .... please don't stop 🥺");
    }
}
