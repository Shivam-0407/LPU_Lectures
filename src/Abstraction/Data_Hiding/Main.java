package Abstraction.Data_Hiding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(45,74);
        Student s2 = new Student(47,74);

//        if(s1<s2){
//            System.out.println("Student s1 have higher marks");
//        }

        if(s1==s2){
            System.out.println("both have equal marks");
        }

        if(s1.equals(s2))
            System.out.println("Marks equal");

//        s1= null;
        System.out.println(s1.getClass());

    }
}
