package OOPs.Singleton;

public class Main2 {
    public static void main(String[] args) {
        Singleton2 x1 = Singleton2.getInstance(); // main objective-> if the object of singleton class have not been created I'll first create that object & rteturn that object
        Singleton2 x2 = Singleton2.getInstance();
    }
}
