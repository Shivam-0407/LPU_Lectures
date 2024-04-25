package Arrays_Pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int roll_no1 = 001;
        int roll_no2 = 002;
        int roll_no3 = 003;
        int roll_no4 = 004;
        int roll_no5 = 005;
        int roll_no6 = 006;
        int roll_no7 = 007;

        // array is a data structure which is used to store collection of data

        // syntax -> data_type [] varaible name = new data_type[size of the array];
        // eg. int [] roll_nos = new int[500];

//        String [] roll_nos = new String[5];
//        roll_nos[0]="Anshika";
//        // [ "Mukesh","Sushil","Anshika",.......]
//        System.out.println(Arrays.toString(roll_nos));


        // 1st section -> have 3 students
        // 2nd section have only 2 students
        // 3rd section have 3 students

        int [][] sections = new int[3][];
        Scanner sc = new Scanner(System.in);
//
//        for(int i=0;i<sections.length;i++){
//            System.out.println("Tell me the no. of students in section "+(i+1));
//            int no_of_students = sc.nextInt();
//            sections[i] = new int[no_of_students];
//            for(int cols=0;cols<no_of_students;cols++){
//                sections[i][cols] = sc.nextInt();
//            }
////            System.out.println(Arrays.toString(sections[i]));
//        }

        // when working with non-primitive datatypes
        // always think in perspective of objects

//        for(int i=0;i<sections.length;i++){
//            for(int j=0;j<sections[i].length;j++){
//                System.out.print(sections[i][j]+" ");
//            }
//            System.out.println();
//        }

        // ArrayList-
//        ArrayList<Integer> one_d_arr_list = new ArrayList<>(3);
//        one_d_arr_list.add(24);
//        one_d_arr_list.add(4);
//        one_d_arr_list.add(64);
//        one_d_arr_list.add(54);
//        System.out.println(one_d_arr_list);

        ArrayList<ArrayList<Integer>> two_d = new ArrayList<>(3);

        for(int i=0;i<3;i++){
            two_d.add(new ArrayList<>());
        }

        System.out.println(two_d.get(0));

        int [] a = {1,2,3};
        int [] b = a;
        a = null;
        b = null;


        System.out.println(Arrays.toString(a));

    }
}
