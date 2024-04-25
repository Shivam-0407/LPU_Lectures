package OOPs.Pack22;

import OOPs.Demo.B;
import OOPs.Demo.C;
import OOPs.InnerClasses.OuterClass1;
import OOPs.Student;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;


public class A {

    public static void main(String[] args) { // this main method does not depend on object for it to run
//       OuterClass1.InnerClass i = new OuterClass1.InnerClass("Anshika");
//        System.out.println(i.name);
//        B b = new B();
//        b.OLA();
        C c = new C();
//        c.OLA();
//        ArrayList<Integer> a = new ArrayList<>();
//        String st = new String();


//        Student s1 = new Student("Kush","Luckn",124,8.99f);
//        System.out.println(Student.class_strength);
//        Student s2 = new Student("Sai","Banglore",114,9.99f);
//        System.out.println(Student.class_strength);
//        System.out.println(Student.college_name);

//        System.out.println(Student.class_strength);
//        Student.class_strength+=1;
//        System.out.println(Student.class_strength);
        A a= new A();
        a.greet(); // but this greet method act as one of the methods of Class A & will depend upon the creation of obj of type class A for it to execute
        OuterClass1.InnerClass i = new OuterClass1.InnerClass("Kush");
    }

    public static void OLA(){
        System.out.println("OLA from class A ");
    }
    public void greet(){
        OLA();
        System.out.println("Hello from class A");
    }

}
