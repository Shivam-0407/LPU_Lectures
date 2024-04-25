package Strings.Group1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
//        int a[] = {2,3,4};
//        int []b = a;
//        b[1]= 1000;
//        System.out.println(Arrays.toString(a));

        String x = new String(" Kushagra             ");
//        System.out.println(x.indexOf('a'));
//        System.out.println(x.charAt(2));
//        System.out.println(x.substring(1,4));
//        System.out.println(x.lastIndexOf('d'));
//        System.out.println(x.length());
      // System.out.println(x.trim());
       System.out.println(x);
//        String y = new String("Kushagra");
//
//        System.out.println(x==y);

        // pretty printing
//        float no = 11.2332457f;
//        System.out.printf(" pretty printing the no. %.2f",no);
//        System.out.println();
//        System.out.printf("%.3f", Math.PI);

        // %c ,%d, %e , %i , %o , %s


        //System.out.println('a'+'z');
//        System.out.println("a"+21); //"21"
//        System.out.println("a "+new ArrayList<Integer>()); //[] -> "[]"
//      //  System.out.println(56+new ArrayList<Integer>());
//        System.out.println(56+" "+new ArrayList<Integer>());
        String z = "Rait";
        StringBuilder sb = new StringBuilder(z);
        sb.append('a');
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.delete(0,2));
        System.out.println(sb.isEmpty());

        System.out.println(sb);


        StringBuilder str = new StringBuilder("af");
        StringBuilder str2 = new StringBuilder("abc");
        System.out.println(str.compareTo(str2));


//        String name2;
//        System.out.println(name2);
    }
}
