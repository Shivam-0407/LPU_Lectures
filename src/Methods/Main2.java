package Methods;


import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
//       String res =  greet("Rauneet");
//       int[] arr = new int[2];
//       arr[0]=1;
//       arr[1]=2;
//
//        System.out.println(arr);
//        System.out.println(1);
//        System.out.println("Hi how are u");

//        System.out.println("Before swap "+Arrays.toString(arr));
//
//       swap(arr);
//
//        System.out.println("After swap "+Arrays.toString(arr));
        //System.out.println(res);

        //greet("Priyanshu ","Saiteja");
        greet(2);
    }

    public static void swap(int[]x){
        int temp = x[0];
        x[0]=x[1];
        x[1]=temp;
    }

    public static void greet(String s,String person2){
        System.out.println(" Hi "+s+" 😎✌️"+" Hi "+person2);
    }

    public static void greet(int x){
        System.out.println("Hi variable x = "+x);
    }

    public static String greet(String s){
        return "Hi "+s+" 😎✌️";
    }

}


// syntax of functions ->

// access_modifier return_type name_of_func(data_type parameter_1 , data_type parameter_2){
//   .......body
// }

 // basic return_types ->  void (empty) -> will not return anything
    // String , int , long , char .......

// local variable will be preferred over global variables
