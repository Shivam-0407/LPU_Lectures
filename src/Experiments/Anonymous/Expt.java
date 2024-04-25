package Experiments.Anonymous;

import java.util.Comparator;

public interface Expt {
    public void add();
    public void divide();

    public static void main(String[] args) {
        Expt child = new Expt() {
            @Override
            public void add() {
                System.out.println("Yo wassup");
            }

            @Override
            public void divide() {
                System.out.println("Kyaa haal veere");
            }
        };

        child.add();
        child.divide();

        class local_class implements Expt{

            @Override
            public void add() {
                System.out.println("Hello from the local class");
            }

            @Override
            public void divide() {
                System.out.println("Kaise ho ");
            }
        }

        local_class lc = new local_class();
        lc.add();
        lc.divide();


    }
}


