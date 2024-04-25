package ObjectStreaming.G2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Object1 obj1 = new Object1(54);
        Student s2 =  new Student("12CX77","SAI",19);

//        try{
//            FileOutputStream fileOut = new FileOutputStream("objects_ser.txt");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(obj1);
//            out.writeObject(s2);
//            out.close();
//            fileOut.close();
//
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        try{
            FileInputStream fileIn = new FileInputStream("objects_ser.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object1 deserialzed_obj_1 = (Object1) in.readObject();
            Student deserialzed_obj_2 = (Student) in.readObject();

            in.close();
            fileIn.close();
            System.out.println(" Deserialized object1 = "+deserialzed_obj_1);
            System.out.println(" Deserialized object2 = "+deserialzed_obj_2);

        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
