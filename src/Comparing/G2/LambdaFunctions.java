package Comparing.G2;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }



//        arr.forEach((item)-> {
//            if(item!=1)
//                System.out.println(item);
//        });
        System.out.println(arr);
        Consumer<Integer> func = (item) -> System.out.println(item*2);
        arr.forEach(func);

        // Lambda functions can be assigned to variables
        // of type interfaces coz thier implementation
        // is provided

        Operation sum = (a,b) ->a+b;
        Operation diff = (a,b) ->a-b;
        Operation prod = (a,b) ->a*b;

        LambdaFunctions myClaci = new LambdaFunctions();
        System.out.println(myClaci.operate(3,41,sum));
        System.out.println(myClaci.operate(3,41,diff));
        System.out.println(myClaci.operate(3,41,prod));
    }

    interface Operation{
        int operation(int a,int b);

    }
}
