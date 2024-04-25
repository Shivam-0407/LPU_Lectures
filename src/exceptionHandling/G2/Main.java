package exceptionHandling.G2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
//        System.out.println("Attempting to read from file in: "+f.getCanonicalPath());
//        System.out.println("You typed : "+br.readLine());
            while(br.ready()){
                System.out.println(br.readLine());
            }
//        try {
//            String name = "Kushagra";
//            if(name.equals("Kushagra")) {
//                throw new MyCustomClassException("Error from Custom Exception Class");
//            }
//        } catch (Exception e) {
//            System.out.println("Exception error " + e.getMessage());
//        }
//        finally {
//            System.out.println("I will execute no matter what");
//        }
    }


    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Bro seriously... u want to divide a no. by zero");
        }
        return a/b;
    }
}
