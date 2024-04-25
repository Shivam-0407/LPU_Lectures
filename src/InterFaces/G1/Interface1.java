package InterFaces.G1;

public interface Interface1 {

    default void swim(){
        System.out.println("I will swim in river");
    }
    void greet();

    static void greet1(){

    }

//    void extra_function();
}
