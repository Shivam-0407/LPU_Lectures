package InterFaces.G1;

public class Eg {
    public interface NestedInterface{
        public boolean isOdd(int num);
    }

}

class B implements Eg.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return num%2!=0;
    }
}
