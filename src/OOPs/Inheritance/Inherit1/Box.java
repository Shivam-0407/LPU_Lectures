package OOPs.Inheritance.Inherit1;

public class Box {
     private double l;
    double b;
    double h;

    public double getL() {
        return l;
    }

    double wt;

    public Box() {
        super();
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    public Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.wt=old.wt;
    }

    Box(double side){
        this.l = side;
        this.h = side;
    }

    public Box(int l, int b, int h) {
        super();
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void eg(){

    }

}
