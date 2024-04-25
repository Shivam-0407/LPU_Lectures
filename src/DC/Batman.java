package DC;

import java.util.Scanner;

public class Batman {

    public static void main(String[] args) {
//        int a = 10; // -2^31 upto 2^+31-1
//        char c = 'a';
//        double d = 12.00;
//        float f = 12.0f;
//        long largerInteger = 12345671122L; // -2^63 to 2^63 -1;
//        boolean b = false;
//        short x = 23; // -2^15 uptill 2^15-1
//        byte b = 32; // -2^7 upto 2^7-1 (-128 to 127)
//        //not a primitive data type
//        int a= 90_00_00_000;
//        Scanner sc = new Scanner(System.in);
//        String temp = sc.next(); // "12345"
//        char c = temp.charAt(2);
//        System.out.println(c);
//        int x = Integer.parseInt(temp); // 12345
//        System.out.println(x);
//

        //Operators
        // Arithmetic operators - *,/,+,- , % (5%2 = 1)
        // Comparison Operator -

//        System.out.println(true);
//        System.out.println((1!=2));
//        System.out.println(true);
//        System.out.println((1>2));
//        System.out.println((1<=2));
//        System.out.println((1>=2));


        // Unary Operator
        // + ive nos
        // - ive nos
        int x = 5;

        // ++ ,--

        // Assignment operator -> var x = 5

        // Ternary operator

        // condition ? statement a : statement b;

        // Conditonal operator ->

//        System.out.println(Integer.toString(22,16));
//        System.out.println(Integer.parseInt("10110",16));

        coinChange(new int[]{1,2,5},11);

        //ystem.out.println(( 1>2 ?"lhs is greater than rhs" : "rhs is the father ✌️😎"));

//        System.out.println("PostFix operator "+ (x++));
//        System.out.println("PreFix operator "+ (++x));
//        System.out.println(x);

//        System.out.println((x++)+" . "+(++x));
//        System.out.println((x--)+" . "+(--x));



        // 234.55 -> precision = 5 , scale = 2



//        System.out.println((5%2)); //2.5*2 =5 ->0(res)
//        System.out.println((5.25%2));
    }



    public static int Random(){
        return 0;
    }

    public static int coinChange(int[] coins, int amount) {
        long ans = solve(coins,amount);

        return ans==Integer.MAX_VALUE?-1:(int)ans;
    }

    public static long solve(int[] coins, int amount){
        if(amount==0){
            return 1;
        }
        if(amount<0)
            return Integer.MAX_VALUE;

        long ans = Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            ans = Math.min(ans,1+solve(coins,amount-coins[i]));

        }
        return ans;
    }
}
