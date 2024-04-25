package Queue_DS;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main1 {
    public static void main(String[] args) {
//        Queue<Character> q1 = new LinkedList<>();
//        q1.add('x');
//        q1.add('a');
//        q1.add('f');
//        q1.add('z');
//
//        q1.offer('e');
//        q1.offer('a');
//        q1.offer('h');
//        q1.offer('j');
//        q1.offer('s');
//        System.out.println(q1);
//        System.out.println(q1.poll());
//        System.out.println(q1);
//        while(!q1.isEmpty()){
//            System.out.println(q1.poll());
//        }


        // DOUBLE ENDED QUEUE

        Deque<Integer> dq = new LinkedList<>();
        dq.add(54);
        dq.offerFirst(51);

        dq.offerLast(89);
        dq.offerLast(89);
        dq.offerLast(51);
        System.out.println(dq);
//        dq.poll();
//        System.out.println(dq);
//        dq.pollFirst();
//        System.out.println(dq);
//        dq.pollLast();
//        System.out.println(dq);
//        System.out.println(dq.remove());
//        System.out.println(dq.peek());
//        System.out.println(dq.peekFirst());
//        System.out.println(dq.peekLast());
        System.out.println(dq.removeFirstOccurrence(39));
        System.out.println(dq.removeLastOccurrence(51));
        System.out.println(dq);
    }
}
