package ObjectStreaming;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File new_file = new File("object_streaming.txt");
            Student s1 = new Student("32XEF","Bharat",19);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new_file));
            oos.writeObject(s1);

//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new_file));
//            Student s2 = (Student) ois.readObject();
//            System.out.println(s2);
        }catch (IOException e){
            System.out.println(e.getMessage());}

//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
