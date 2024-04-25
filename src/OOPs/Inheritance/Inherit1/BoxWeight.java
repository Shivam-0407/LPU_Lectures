package OOPs.Inheritance.Inherit1;

public class BoxWeight extends Box {
    double wt;
    public BoxWeight() {
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.wt=other.wt;
    }

    public BoxWeight(int l, int b, int h, double wt) {
        super(l, b, h);

        this.wt = wt;
    }
    public BoxWeight(double side, double wt) {
        super(side);
        this.wt = wt;
    }

//    public int area(){
//        return l*b;
//    }
}
