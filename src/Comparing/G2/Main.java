package Comparing.G2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StudentG2 Kush = new StudentG2(47,98);
        StudentG2 Vikas = new StudentG2(57,95);
        StudentG2 Tanmay = new StudentG2(17,92);
        StudentG2 Gurmukh = new StudentG2(57,95);
        StudentG2 Sahil = new StudentG2(57,96);

        StudentG2[] list = {Kush,Vikas,Tanmay,Gurmukh,Sahil};


//        Arrays.sort(list); // O(n logn)
//        System.out.println(Arrays.toString(list));
//        if(Kush.compareTo(Vikas)<0){
//            System.out.println("Vikas's marks are higher");
//        }else{
//            System.out.println("Kush got higher marks");
//        }


        System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<StudentG2>() {
            @Override
            public int compare(StudentG2 o1, StudentG2 o2) {
                return 0;
            }
        });


        Arrays.sort(list, (o1, o2) -> (o1.marks-o2.marks));



        System.out.println(Arrays.toString(list));

    }

    // In java we can also pass functions as arguments in diff. functions


}
