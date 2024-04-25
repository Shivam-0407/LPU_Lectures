package OOPs.Demo;

public class Main {
    public static void main(String[] args) {
        ObjectDemo ob1 = new ObjectDemo(54,87.66f);
        ObjectDemo ob2 = new ObjectDemo(44,97.66f);

        if(ob1==ob2){
            System.out.println("ob1 is less than ob2");
        }

        if(ob1.equals(ob2)){
            System.out.println("both have the same num variable");
        }else{
            System.out.println("Sorry try again");
        }

        System.out.println(ob1 instanceof ObjectDemo);
    }
}
