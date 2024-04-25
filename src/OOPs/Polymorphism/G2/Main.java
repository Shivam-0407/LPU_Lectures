package OOPs.Polymorphism.G2;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();
//        Square sq = new Square();
//        sq.area();
        s.area();
        c.area();

        Shape s2 = new Square(); // in case of over-riding ;the methods
                                // that we can access solely depends upon
                                //the type of object
        s2.area();

        // parent ref.variable = new child object();
        // if there is an over-riden method that will solely depend
        // upon the type of our object
        // also known as " UPCASTING"

        // "Dynamic method dispatch"
        Shape s1 = new Shape();
        Square child = new Square();
        child.b=20;

        System.out.println(child);

//        Shape s1 = new Shape();
        Shape.area();

        //
    }
}

// 2 types of poly-

// Compile time / Static poly -> achieved via method overloading


