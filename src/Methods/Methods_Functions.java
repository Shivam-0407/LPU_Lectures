package Methods;

import java.util.Arrays;

public class Methods_Functions {

    static int x = 100;

    public static void main(String[] args) {
        //greet();
//        add(3,55);

int x = 800;
//        int a = 23,b=45;
//
//        swap(a,b);
//
//        System.out.println(" After swap method --> "+a+" "+b);
//        String x = new String("ear");
//        String y = new String("nose");
//        swap_Primitives(x,y);
//
//        System.out.println(" after swap = "+x+" "+y);

//        int [] a= new int[]{1,2};
//        System.out.println(" Before swap => "+Arrays.toString(a));
//
//        swap_arr(a);
//
//        System.out.println(" After swap => "+Arrays.toString(a));

//        greet("Aswin");
//        greet("Aswin",20);

        int res = sumDigit(123);
        System.out.println(res);
    }

    private static int sumDigit(int n) {
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        return sum;
    }

    // Q. write a function in which u'll pass the number & it will return u the sum of the digits (three digit no)


    private static void greet(String person1){
        System.out.println(" Hi "+person1);
    }

    private static  void greet(String person1,int age){
        System.out.println(" hi "+person1+" your age is  " +20);
    }

    private static void swap_arr(int[] qrt) {
        int temp = qrt[0];
        qrt[0] = qrt[1];
        qrt[1] =temp;

        System.out.println(x);

    }

    private static void swap_Primitives(String x, String y) {
        String temp = x;
        x = y;
        y = temp;

        System.out.println(" inside method swap = "+x +" "+y);
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println(" inside swap method = "+x +" "+ y);
    }



//    public static void greet(){
//        System.out.println(" Hi there!! ");
//    }

    public static void add(int a,int b){
        System.out.println((a+b));
    }

    // syntax - access_modifier return_type method_name(){
    //  ...... operations are performed over here
    // }

    // return type -> void(func will not return anything)
    // int -> that we'll only return an integer type of data
    // String -> it will string
    // int [] -> we'll return an array of type integer
    // long
    // .....


}
