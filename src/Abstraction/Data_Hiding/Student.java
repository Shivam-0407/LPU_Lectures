package Abstraction.Data_Hiding;

import java.util.Objects;

public class Student {
    int roll_no;
    int marks;

    public Student(int roll_no, int marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        return  this.marks == ((Student)o).marks ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no, marks);
    }
}
