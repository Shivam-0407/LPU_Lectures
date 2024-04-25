package InterFaces.G2;

public interface A {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class X implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return num%2!=0;
    }
}
