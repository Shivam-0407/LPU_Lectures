package exceptionHandling.G1;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            divide(a,b);
            // do the normal stuff over here but if something
            // bad happens
//            StringBuilder sb = null;
//            sb.deleteCharAt(0);

            String name = "Rauneet";
            if(name.equals("Rauneet")){
                throw new CustomExceptions("this is Rauneet's Exception");
            }
        }catch (ArithmeticException e){
            // then catch will catch it in the catch block
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will always execute no matter what");
        }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("please don't divide by zero coz infinity is out of range for u as well as me");
        return a/b;
    }
}
