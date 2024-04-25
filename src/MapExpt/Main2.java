package MapExpt;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        //create
        Map<String,String> m = new TreeMap<>();


        // insert the elements
        m.put("IN","India");
        m.put("JP","Japan");
        m.put("BL","Bangladesh");
        m.put("AF","Afghanistan");
        m.put("AS","Austria");
        m.put("AA","Austria");
        m.put("ML","Malaysia");

        Map<String,String> m2 = new HashMap<>();
        m2.putAll(m);
        m2.put("RS","Russia");
//        System.out.println("Checking..... -> "+m.equals(m2));
        System.out.println("Entry set = "+m.entrySet());
        System.out.println("Key set = "+m.keySet());
        System.out.println("Values collection = "+m.values());

        //read
        System.out.println(m);

        //update -> since a key is unique , therefore old value will be replaced
        // by new value
        m.put("IN","Bharat");
        System.out.println(m);

        //delete
        m.remove("ML");
        System.out.println(m);

        int[] arr = {1,5,3,2,4,1,5,4,6,7,8,1,5,6,7,2};
        Map<Integer,Integer> freq_map = new HashMap<>();
        // an empty object in the heap [0 keys, 0 values]

        // we will 1st see if a particular no.(Key) is present or not
        // if it is already present we will inc. the freq. by 1
        // if no. is not present we will first put that no.(Key) with an initial
            // freq. of 0 then we'll increment by 1

 //        1st variation
//        for(int no:arr){
//            freq_map.putIfAbsent(no,0); // there will be no concept of default values
//            freq_map.put(no,freq_map.get(no)+1);
//        }

        // 2nd variation

        for(int no:arr){
            if(!freq_map.containsKey(no)){
                freq_map.put(no,0);
            }
            freq_map.put(no, freq_map.get(no)+1);
        }

        // {null+1}
        System.out.println(freq_map);


    }
}
