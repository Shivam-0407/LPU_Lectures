package OOPs.Inheritance.Inherit2;

public class BoxWeight extends Box{
    double wt;

    public BoxWeight(int wt) {
        this.wt=wt;
    }

    BoxWeight (BoxWeight oth){
        super(oth);
        this.wt = oth.wt;
    }

    public BoxWeight(int wt,int l,int h) {
        super(l,h);
        super.wt = wt;
        this.wt = wt;

    }

    public BoxWeight(double side, double wt) {
        super((int) side);
        this.wt = wt;
    }


//    public void area(){
//        return l*h;
//    }
}
