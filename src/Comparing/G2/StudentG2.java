package Comparing.G2;

public class StudentG2 {
    int roll_no;
    int marks;

    public StudentG2(int roll_no, int marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+"";
    }

//    @Override
//    public int compareTo(StudentG2 o) {
//        int diff = this.marks-o.marks;
//
//        // if diff==0 then both are equal
//        // iff diff<0 ; student o got higher marks
//         // else Student o got lesser marks
//        return diff;
//    }
}
