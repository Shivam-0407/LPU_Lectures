package Comparing.G1;

public class Student implements Comparable<Student> {
    int roll_no;
    int marks;

    public Student(int roll_no, int marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = this.marks - o.marks;
        // Ayush(89) - Aswin(99)
        // if diff ==  0 -> that the values that we are comparing are equal
        // < 0 -> o.marks is greater than this.marks else o.marks is less than this.marks

        return diff;
    }

    @Override
    public String toString() {
        return marks+"";
    }
}
