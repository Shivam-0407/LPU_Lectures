package OOPs.Polymorphism.G2;

public class Greetings {
     Greetings(){
        System.out.println(" Hi from the normal constructor ");
    }

     Greetings(String s1){
        System.out.println(" hi "+s1+" how r u??");
    }

     Greetings( String name1,String name2){
        System.out.println(" hi "+name1+" how r u??");
        System.out.println(" wassupp "+name2);
    }

    public static void main(String[] args) {
        Greetings g1 = new Greetings();

    }
}
