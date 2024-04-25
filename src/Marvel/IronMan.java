package Marvel;

import DC.Batman;

import java.util.Scanner;

public class IronMan {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        if((n&1)==0){
            System.out.println("The no. is 😎✌️ ");
        }else{
            System.out.println("The no. is 😁✌️");
        }
    }
}
