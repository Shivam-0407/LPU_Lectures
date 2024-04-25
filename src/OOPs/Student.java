package OOPs;

public class Student {

    public String name;
    public String city_name;
    public int roll_no;

    public float CGPA;

    public static String college_name = "LPU";
    private static int class_strength = 0;

    public Student(String name, String city_name, int roll_no, float CGPA) {
        this.name = name;
        this.city_name = city_name;
        this.roll_no = roll_no;
        this.CGPA = CGPA;
        Student.class_strength+=1;
    }

    public float newCGPA(){
        return CGPA/10;
    }

    public static void main(String[] args) {
        System.out.println(Student.class_strength);
    }

}
