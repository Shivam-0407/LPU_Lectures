package OOPs.Singleton;

public class Singleton2 {
    private Singleton2(){
        // we can't call this constructor except from this class
    }

    private static Singleton2 ref_variable;

    public static Singleton2 getInstance(){
        if (ref_variable == null) {
            ref_variable = new Singleton2(); //XYZ
        }
        return ref_variable; // XYZ
    }
}
