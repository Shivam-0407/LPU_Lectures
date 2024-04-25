package Strings.Group1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String name1 = "Ajay";
        String name2 = new String("Ajay");

        System.out.println(name2.equals(name1));

        // Pretty Printing

//        float x = 4.011234f;
////        System.out.printf("Formatted String is %.2f",x);
//        System.out.printf("updated pi value is %.3f",Math.PI);
//        // %c - char , %d - double .... check out the list

        String a = "XYZQTREWWWY";
        System.out.println(a.charAt(2));
        System.out.println(a.substring(1,4)); // exclusive in nature
        System.out.println(a.endsWith("WTY"));
        System.out.println(a.indexOf("M"));

        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb.toString());
//        StringBuilder ref = sb;
//        sb.append('c');
//        System.out.println(sb.toString());
//        System.out.println(ref.toString());
//        System.out.println();
//        System.out.println(a);
//        System.out.println('a'+'b');
//        System.out.println("a"+"b");
//
//        System.out.println("a"+1); // "1"
//        System.out.println("Ajay"+new ArrayList<Integer>()); // "[]"
//        //System.out.println(57+new ArrayList<Integer>());
//
//        System.out.println(57+""+new ArrayList<Integer>()); //"57"
    }
}
