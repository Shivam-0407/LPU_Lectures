package Demo.Package_Demo;

import java.util.Scanner;
import Class_Demo.Student;

public class Class_Demo {
    public static void main(String[] args) {
//        System.out.println("नमस्ते  World 😁✌️");
//        Scanner sc = new Scanner(System.in);
////        int x = sc.nextInt();
//        String x = sc.nextLine();
//        System.out.println(x);
//
//        String y = "h";
//        y+='e';
//        y+='l';
//        y+='l';
//        y+='o';
//
//        int zz = 28;
//        Integer wrapper = zz;
//        System.out.println(Integer.toString(wrapper));
//
//        System.out.println(y.charAt(2));
//        char c = findNthDigit(7,123456780);
//        System.out.println(c);
        System.out.println(Integer.toBinaryString(32));
        System.out.println(Integer.toString(32,8));

        int sw = 48;
        Student s1 = new Student();
    }

    public static  char findNthDigit(int n,int no){
        String string_no = Integer.toString(no);
        char c = string_no.charAt(n-1);

        return c;
    }
}
