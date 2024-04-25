package Abstract2;

public abstract class Parent {
   final int age;
   static String name;

    public Parent(int age) {
        this.age = age;
    }

    static void greeting(){
        System.out.println("Hello");
    }

    public void normie(){
        System.out.println(" Hello from the Parent ");
    }

    abstract void carrer(String carrer);
    abstract void partner(String partner);
}
