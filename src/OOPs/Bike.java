package OOPs;

public class Bike {
    String engine;
    String engine_type;
    float tank_capacity;
    int seats;
    String  price;

    float speed;

    float dist;

    float time;

    Bike(){ // default constructor
        this("1000 cc",15.5f,2,"75.5 Lacs","Water");
    }

    // this keyword

    Bike(String engine,float tank,int seats,String price,String engine_type){ // initializer block
        this.engine = engine; // new_bmw.engine = engine;
        tank_capacity = tank; // new_bmw.tank_capacity = tank;
        this.seats = seats;
        this.price = price;
        this.engine_type = engine_type;
    }



    public float getAvgSpeed(){
        return (dist/time);
    }

    public static void main(String[] args) {

        Bike bmw = new Bike(); // new keyword will create an object of type bike in the heap memory when the program is actually running
        System.out.println(bmw.engine);
        System.out.println(bmw.price);

        int [] arr = new int[5];

        Bike new_bmw = new Bike("1000cc",0.0f,2,"33.5 Lacs","Hydrogen");
        System.out.println(new_bmw.engine);
        System.out.println(new_bmw.engine_type);
        System.out.println(new_bmw.seats);

        Bike b2 = new_bmw;
        b2.engine = "200 cc";

        System.out.println("Downgraded engine = "+new_bmw.engine);



    }
}

// BMW bike is a real world running object in front our eyes -> 23.35Lacs, 2, 15Lts, 1000CC;
// Royal_Enfield -> 2.00Lacs, 2 , 10Lts, 500CC;

// Honda ->


// class ->template or set of rules for an object
// object -> is an instance(physical stuff or real world entity) of a class
           // will actually occupy the space in the memory