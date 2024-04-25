package ObjectStreaming.G2;

import java.io.Serializable;

public class Student implements Serializable {
    String UID;
    String name;
    int age;

    public Student(String UID, String name, int age) {
        this.UID = UID;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "UID='" + UID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
