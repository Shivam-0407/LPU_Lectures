package OOPs.Inheritance.Inherit2;


public class Main {
    public static void main(String[] args) {
//        Box b1 = new Box(4,5);
        BoxWeight bw1 = new BoxWeight(10);
////        System.out.println(bw1.h+" "+bw1.wt);

//        Box b2 = new BoxWeight(2,4,76);
//        System.out.println(b2.l);
//        System.out.println(b2.h);
//        System.out.println(b2.wt);

//        BoxWeight bw = new Box(4,5);

        BoxWeight b2 = new BoxWeight(bw1);
        System.out.println(b2.wt);
    }
}
