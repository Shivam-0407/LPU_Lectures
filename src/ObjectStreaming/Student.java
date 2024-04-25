package ObjectStreaming;

import java.io.Serializable;

public class Student {
    String unique_ID;
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "unique_ID='" + unique_ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String unique_ID, String name, int age) {
        this.unique_ID = unique_ID;
        this.name = name;
        this.age = age;
    }

}
