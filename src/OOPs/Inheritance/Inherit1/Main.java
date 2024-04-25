package OOPs.Inheritance.Inherit1;

public class Main {
    public static void main(String[] args) {
//        BoxWeight r1 = new BoxWeight();
//        r1.l=10;
//        r1.b = 20;
//        BoxWeight r2 = new BoxWeight(5,4,9,8.0);
//        Box b = new BoxWeight(2,4,12,9);
////        BoxWeight bw =  new Box(2,4,6);
////        System.out.println(bw.l);
////        System.out.println(bw.wt);
//
//        Box b2 = new BoxWeight(r2);
//        System.out.println(b2.wt);


//        BoxPrice bp1 = new BoxPrice(4,54,75);
//
//        System.out.println(bp1.wt);
//        System.out.println(bp1.h);

        Box b = new BoxWeight(24,89.6);
        System.out.println(b instanceof BoxPrice);

    }
}
