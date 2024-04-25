package InterFaces.G2;

public class Main {
    public static void main(String[] args) {
//        Engine c = new Car();
//        c.brake();
//        c.start();
//        c.stop();

//        Media_Player m = new Car();
//        m.start();
//        m.stop();

        SmartCar sm = new SmartCar(new PowerEngine());
        sm.start();

        sm.musicStart();
        sm.musicStop();

        sm.stop();

        sm = new SmartCar(new Electric());
        sm.start();

        X obj = new X();
        System.out.println(obj.isOdd(20));

    }
}
