package OOPs.Polymorphism.Poly1;

public class Numbers {
    int x;

    public Numbers(int x) {
        this.x = x;
    }

    double sum(double a, double b){
        return a+b;
    }

    double sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return  a+b+c;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "x=" + x +
                '}';
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers(23);
        obj.sum(4.0,4.5);
        obj.sum(4,4);

        System.out.println(obj);

    }
}
