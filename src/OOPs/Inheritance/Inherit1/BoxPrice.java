package OOPs.Inheritance.Inherit1;



public class BoxPrice extends BoxWeight {
    double cost;
    public BoxPrice(double side,double wt,double cost) {
        super(side,wt);
        this.cost=cost;
    }
}
