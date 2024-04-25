package packetzz;

public class Outer {
    int s;

    public Outer(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return Integer.toString(s);
    }

    public static void main(String[] args) {
        Outer o = new Outer(40);
        System.out.println(o.toString());
    }
}
