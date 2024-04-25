package Abstract2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parent s = new Son(84);
//        Parent p = new Parent(); // we can't create objects of abstract classes
        s.carrer("software development");
        s.partner("XYZ");
        s.normie();
        Parent.greeting();

        Scanner sc = new Scanner(System.in);
    }
}
