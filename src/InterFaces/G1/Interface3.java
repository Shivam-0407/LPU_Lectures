package InterFaces.G1;

public interface Interface3 extends Interface1,Interface2{


    @Override
    default void swim() {
        Interface1.super.swim();
    }
}
