package ConditionsAndLoops;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//      String favorite_subj = sc.next();
//      String a = "Raj";
//      String b = "Raj";
//      System.out.println((a==b));
//      if(favorite_subj.equals("Full_Stack")){
//          System.out.println("I will work hard on this subject as I ❤️ it");
//      }else{
//          System.out.println("I'll just pass the subject");
//      }

//        if(n==1){
//            // only this block will run & none of the others will run
//            System.out.println("My favorite subject is Full Stack");
//        }else if(n==2){
//            // will run onlyyyyyyyyyy ifffff the 1st condtion becomes false
//            System.out.println("My favorite spot in college is 🤖 ");
//        }else if(n==3){
//            // will run only ifffffff the above condition becomes false
//            System.out.println("My favorite snack is 🌯");
//        }else{
//            // will run only whennnn alll theee above conditions are false
//            System.out.println(" My favorite time pass is 😴");
//        }

        // for-loop syntax
        // for(intilisation; condition ; increase/decrease){
        //    // Repetitve tasks are performed here / body
        //        }

//        for (int i = 1; i <= 5; i++)
//            System.out.println("No. is = " + i);


        // while(condition) {
        // body
        //  }
//
//        int x = 1;
//        while(x<=5){
//            System.out.println("No is = "+x);
////            x++;
//        }

        // Guess GAME
//        Scanner sc = new Scanner(System.in);
//        String x = sc.next();
//        while(!x.equals("X")){
//            System.out.println("You have not unlocked the secret lock");
//            System.out.println("Guess the 🗝️ again");
//            x = sc.next();
//        }
//        System.out.println("Congrats 😎✌️ u just figured out the secret key");


        // do-while loop
//        do{
//            // body
//        }while() // condition


//        int n = 1;
//        do{
//            System.out.println(n);
//            n++; // increase/decrease conditions
//        }while(n<=5);

        // while - will be used when we don't know how many will times will our loop will run
        // do while - is used when we need to execute our statement atleast once

        // while - entry control loop
        // do while - exit control loop


        // 1.) find the max among 3 nos

//        Scanner sc =  new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a>b && a>c){
//            System.out.println(a+" is the max element");
//        }else if(b>a && b>c){
//            System.out.println(b+" is the max element");
//        }else{
//            System.out.println(c+" is the max element");
//        }

//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(" max element is = "+max);


        // q. we've to fig. out whether the character is a lower case character or uppercase
        Scanner sc = new Scanner(System.in);

//        char ch = scanner.next().charAt(0);

//        if (Character.isUpperCase(ch)) {
//            System.out.println(ch + " is an uppercase letter.");
//        } else if (Character.isLowerCase(ch)) {
//            System.out.println(ch + " is a lowercase letter.");
//        } else {
//            System.out.println(ch + " is not a letter.");
//        }

//        if(ch>='a' && ch<='z'){
//            System.out.println(" lowercase character ");
//        }else if(ch>='A' && ch<='Z'){
//            System.out.println(" upper case character ");
//        }else{
//            System.out.println(" not a character");
//        }

        // q. u've to fig. out whether a digit given via console in a number or not
        // eg. digit = 3 number = 45611 "false"

//        int digit = sc.nextInt();
//        int n = sc.nextInt();
//        boolean flag = false;
//        int temp = n;
//        while(temp>0){
//            int d = n%10; // if ur doing %10 u'll be able to get the last digit
//            System.out.println(" extracted last digit = "+d +" & the no. is = "+n);
//            if(d==digit){
//                flag = true;
//            }
//            n = n/10; // it will remove the last digit from your actual no.
//            System.out.println(" remaining no. is = "+n);
//        }
//
//        if(flag){
//            System.out.println("Digit "+digit+" is there");
//        }else{
//            System.out.println("Digit "+digit+" is not there 🥺");
//        }

        // 121 -> Pallindrome

//        int no = sc.nextInt();
//        String number_String = Integer.toString(no);
//        int left = 0, right = number_String.length()-1;
//         boolean flag = true;
//        while (left < right) {
//            if(number_String.charAt(left)==number_String.charAt(right)){
//                left++;
//                right--;
//            }else{
//                flag = false;
//                break;
//            }
//        }

//        if(flag){
//            System.out.println("Congrats u've got a pallindrome no. 😎✌️");
//        }else{
//            System.out.println("Sorry your no. is not pallindrome 🤖");
//        }


//        int n = sc.nextInt();
//        if((n&1)==0){
//            System.out.println(" Even no. 😎✌️");
//        }else{
//            System.out.println(" Odd no. 🤖✌️");
//        }

//        char c = sc.next().charAt(0);
//        int no1 = sc.nextInt();
//        int no2 = sc.nextInt();
//
//        if(c=='+'){
//            System.out.println((no1+no2));
//        }else if(c=='*'){
//            System.out.println((no1*no2));
//        } else if (c=='-') {
//            System.out.println((no1-no2));
//        }else{
//            System.out.println((no1/no2));
//        }

        // Ternary Operator
        //   condition ? statement A : statement B

//        int n = sc.nextInt();
//
//        System.out.println(((n&1)==0) ? "Even no. 😎✌️" : "Odd no 🤖✌️");

        // Loops
        // syntax -> for(initialisation ; condition ; increase/decrease){
        // ****** XYZ ****
        // }


//        for(int i=1;;i++){
//            System.out.println(" no. is = "+i);
//        }

        // while(condition){

//        int i=1;
////        while(i<=5){
////            System.out.println("No is = "+i);
////            i++;
////        }
//
//        do{
//            System.out.println("no is = "+i);
//            i++;
//        }while(i<=5);

        // Guess Game
//        char c = sc.next().charAt(0);
//        while(c!='X'){
//            System.out.println("Your guess wasn't accurat enough . Try again !!");
//            c = sc.next().charAt(0);
//        }
//        System.out.println(" Congrats u've earned a 🧀🍕");

        // Q. you've to take 3 nos. as an input & u've to find out the largest


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a >= b && a >= c) {
//            System.out.println("The largest number is: " + a);
//        } else if (b >= a && b >= c) {
//            System.out.println("The largest number is: " + b);
//        } else {
//            System.out.println("The largest number is: " + c);
//        }

//        int min = Math.min(c,Math.min(a,b));

        //Q. we've to check whether the character is being taken as an input from console, is it a lowerCase Character or an UpperCase character
        //        // & you've to print the reverse of your input
        //
        //        // eg. 'c' -> // that the "small character"
        //                      // the oppposite C

//        char ch = sc.next().charAt(0);
//        if(Character.isLowerCase(ch)){
//            System.out.println(" Lower Case Character");
//            System.out.println(Character.toUpperCase(ch));
//        }else{
//            System.out.println(" Upper Case Character");
//            System.out.println(Character.toLowerCase(ch));
//        }

//        char ch = sc.next().charAt(0);
//
//        if(ch >= 65 && ch <= 90) {
//            System.out.println("Given character is a Uppercase character.");
//            char ch2 = ch;
//            ch2 = (char)(ch + 32);
//            System.out.println("The character " + ch + " is converted into Lowercase character and that is " + ch2);
//        }
//        else{
//            System.out.println("Given character is a Lowercase character.");
//            char ch2 = ch;
//            ch2 = (char)(ch - 32);
//            System.out.println("The character " + ch + " is converted into Uppercase character and that is " + ch2);
//        }

        // Q. print true if the digit lies in a number or not
        // eg. digit 8 lies in the number -> 23847
        // nextInt()
        // 43523523525245154756856756
//        int number = sc.nextInt();
//        int digit = sc.nextInt();
//        boolean flag = false;
//        while (number != 0) {
//            int remainder = number % 10;
//            System.out.println(" remainder = "+remainder+" original number is = "+number);
//            if (remainder == digit) {
//                flag = true;
//               break;
//            }
//            number /= 10;
//            System.out.println(" Updated value of number = "+number);
//        }
//        if(flag){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }

//        String a = sc.next();
//        int n = sc.nextInt();
//        char no = (char) (n+'0');
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == no) {
//                System.out.println("yes");
//                break;
//            }
//        }


        // Pallindrome 121 ; 1231 eg. 12 -> 10*1+2
//        int n = sc.nextInt();
//        int temp = n;
//        int sum = 0;
//
//        while (temp > 0) {
//            int rem = temp % 10;
//            sum = sum * 10 + rem;
//            temp /= 10;
//        }
//
//        if (sum == n) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }
//    }

        // + ,- , / ,* ,%
        // addition operation is being performed

//        System.out.println("Enter a no: ");
//        int a=sc.nextInt();
//        System.out.println("Enter another no: ");
//        int b=sc.nextInt();
//        System.out.println("Enter operator: ");
//        char c=sc.next().charAt(0);
//        if (c=='+'){
//            System.out.println("Addition is being performed: "+ (a+b));
//        } else if (c=='-') {
//            System.out.println("Subtraction is being performed: " + (a-b));
//
//        }
//        else if (c=='*'){
//            System.out.println("Multiplication is being performed: "+ (a*b));
//
//        } else if (c=='/') {
//            System.out.println("Division is being performed: " + (a/b));
//        } else if (c=='%') {
//            System.out.println("Remainder is : " + (a%b));
//
//        }
//        else {
//            System.out.println("Invalid operator");
//        }

        //switch(expression)


//        double result, num1, num2;
//        while (true) {
//            System.out.println("enter + to add");
//            System.out.println("enter - to subtract");
//            System.out.println("enter * to multiply");
//            System.out.println("enter / to divide");
//            System.out.println("enter % to find remainder");
//            System.out.println("enter 0 to exit");
//            char choice = sc.next().charAt(0);
//            System.out.print("Enter two numbers: ");
//            num1 = sc.nextDouble();
//            num2 = sc.nextDouble();
//
//            switch (choice) {
//                case '+' -> {
//                    result = num1 + num2;
//                    System.out.println("Result: " + result);
//                }
//                case '-' -> {
//                    double res = num1-num2;
////                    switch(res){
////
////                    }
//
//
//                    System.out.println("Result: " + result);
//                }
//                case '*' -> {
//                    result = num1 * num2;
//                    System.out.println("Result: " + result);
//                }
//                case '/' -> {
//                    result = num1 / num2;
//                    System.out.println("Result: " + result);
//                }
//                case '%' -> {
//                    result = num1 % num2;
//                    System.out.println("Result: " + result);
//                }
//                case '0' -> {
//                    System.out.println("Exiting...");
//                    System.exit(0);
//                }
//                default -> throw new IllegalStateException("Unexpected value: " + choice);
//            }

//        }

        // case - > except for priyanshu i'll just print the name of you & for priyanshu
        // I'll also show the department in which he's working


        int empId = sc.nextInt();
        String Department = sc.next();

        switch (empId) {
            case 1 -> System.out.println("This is Kushgara's id ");
            case 2 -> System.out.println("This is Saiteja's ID");
            case 3 -> {
                System.out.println(" this is Priyanshu's ID ");
                switch (Department) {
                    case "SDE":
                        System.out.println("Priyanshu is SDE");
                        break;
                    case "Web Developer":
                        System.out.println("Priyanshu is OP in Web Dev");
                        break;
                    case "Management":
                        System.out.println("Priyanshu is a Manager now 😎✌️");
                        break;
                    default:
                        System.out.println("He is on sabatical");
                }
            }
            default -> System.out.println("Incorrect EMP ID");
        }
    }
}




