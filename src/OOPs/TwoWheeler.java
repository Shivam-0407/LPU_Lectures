package OOPs;

import java.sql.SQLOutput;

public class TwoWheeler {
    // what are the diff properties that u see everday for a two wheeler vehicle?
    String engine;
    String engine_type;
    int seats;
    float price;
    String color;

    float dist;
    float time;

    public float getAvgSpeed(){
        return (dist/time);
    }

    TwoWheeler(){ // default constructor
        this("100 CC","Electric",1.65f,2,"Sky Blue");
    }

    TwoWheeler(String e,String engine_type,float price,int seats,String color){
        engine = e; // OLA.engine // BMW.engine
        this.engine_type = engine_type;
        this.price = price;
        this.seats = seats;
        this.color = color;

    }

    public static void main(String[] args) {
        TwoWheeler OLA = new TwoWheeler();

        System.out.println(OLA.color);
        OLA.color="Sky Blue ";
        System.out.println("After updating color property -> "+OLA.color);
        OLA.engine="200 CC";
        OLA.engine_type = "Electric ";
//        System.out.println(OLA.engine_type);
//        System.out.println(OLA.price);
//        System.out.println(OLA.seats);

        TwoWheeler BMW = new TwoWheeler("1000 CC"," Hydrogen", 75.7f,2,"Black");
        System.out.println(BMW.seats);
        System.out.println(BMW.engine);
        System.out.println(BMW.price);
        System.out.println(BMW.color);

    }
}



// OLA -> "120 CC" , "Electric" , 2 , "1.65 Lacs" , "Magenta"
// BMW -> " 1000 CC", "Electric " , 2 , "35.5 LAcs" , "Red & Black "

// class - defines the template or the set of rules but does not exist physically
// object - follows this template or these set of rules & exist physically in the heap memory

