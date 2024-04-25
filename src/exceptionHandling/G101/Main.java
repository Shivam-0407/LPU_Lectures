package exceptionHandling.G101;

import exceptionHandling.G1.CustomExceptions;

public class Main {
    public static void main(String[] args) {

        try {
            // do normal stuff
            // but when something bad happens catch block will catch it
//            divide(a,b);
//            String str = "Shivam";
//            if(str.equals("Shivam")){
//                throw new CustomExceptions("My custom Exception is being thrown 😎✌️");
//            }
            double a = 0.1;
            double b = 0.2;
            double sum = a + b;
            double diff = b-a;

            System.out.println("Diff: " + (int)diff); // Expected output: 0.3
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will get executed no matter what");
        }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("Warning!! u r trying to divide a no. by zero");
        return a/b;
    }
}
