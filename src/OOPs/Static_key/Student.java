package OOPs.Static_key;

public class Student {
    String name;
    int id;
    String sect;
    static String college_name="LPU";
    static int class_strength=0;

    public Student(String name, int id, String sect) {
        this.name = name;
        this.id = id;
        this.sect = sect;
        Student.class_strength+=1;
    }

    public void getInfo(){
        System.out.println(" Student name = "+name+" Id = "+id+" section = "+sect);
    }

    public static void greet(){
        System.out.println("Greetings from Student Class");
    }

}
