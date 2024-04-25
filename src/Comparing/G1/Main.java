package Comparing.G1;

import Abstract1.Son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Ayush = new Student(45,89);
        Student Aswin = new Student(47,99);
        Student Anshika = new Student(41,95);
        Student Kushika = new Student(65,72);
        Student Ritesh = new Student(32,92);

        Student []list = {Ayush,Aswin,Anshika,Kushika,Ritesh};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(o1.marks-o2.marks);
                // -(+ive) // even when 1st elem is greater
                // since we're multiplying it with a negative no.
                // we'll get a negative no. as a result that means
                // for JAVA it'll assume that we're getting negative value only bcoz
                // o2's marks was greater than o1's marks & that's why I'm gonna put
                // o2 behind o1
            }
        });
        System.out.println(Arrays.toString(list));

//        if(Ayush.compareTo(Aswin) < 0){
//            System.out.println("Aswin's marks are higher");
//        }
    }
}
