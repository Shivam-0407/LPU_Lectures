package Queue_DS;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
//        Queue<String> q = new PriorityQueue<>((x,y)->{
//            return y.compareTo(x);
//        });
//        q.offer("ad");
//        q.add("sd");
//        q.add("ffd");
//        q.add("afgd");
//        System.out.println(q.peek());
//        System.out.println(q.element());
//        while(!q.isEmpty()){
//            System.out.println(q.poll());
//        }
         Queue<String> lq = new LinkedList<>();
         lq.add("Hi ");
         lq.add("How");
         lq.add("are");
         lq.add("you");

        System.out.println(lq);
        lq.remove("are");
        System.out.println(lq);
    }
}
