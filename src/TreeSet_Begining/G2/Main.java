package TreeSet_Begining.G2;

import java.util.HashSet;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Set -> All the values present in a set will be unique
        Set<Integer> s = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();






        set2.add(4);
        set2.add(45);
        set2.add(47);
        set2.add(49);

        s.add(1);
        s.add(1);
        s.addAll(set2);
        s.remove(49);
//        int arr[] = new int[]s.toArray();

        List<Integer> random_list = new ArrayList<>(s);
        System.out.println("random_list = "+random_list);
    }
}
