package Experiments.InnerClasses;

import java.util.Scanner;

public class EvenChecker {
    int x;

    public EvenChecker(int x) {
        this.x = x;
    }

    class EvenCheck{
        public boolean isEven(){
            return x%2==0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        EvenChecker ev = new EvenChecker(x);
        EvenCheck e = ev.new EvenCheck();
        boolean res = e.isEven();

        if(res==true){
            System.out.println("no. is even");
        }else{
            System.out.println("no. is Odd");
        }
    }

}




