package OOPs.Static_key;

public class Main1 {

    public static void main(String[] args) {
//        Student s1 = new Student("Aswin",1255,"A");
//        s1.getInfo();
//
//        System.out.println(Student.class_strength);
//        Student s2 = new Student("Anshika",1245,"A");
//        System.out.println(Student.class_strength);
//        Student.class_strength+=1;
//        System.out.println(Student.class_strength);
        Hello();
    }



    public static void Hello(){
        System.out.println("Ola I'm here without static");
    }

    public void greet(){
        Hello();
    }

    // Hello depends upon the creation of Main1 obj in the heap mem
    // for it to run
    // but our main method is static
    // & we all know that static stuff does not depend upon object creation
    // in the heap mem
}
