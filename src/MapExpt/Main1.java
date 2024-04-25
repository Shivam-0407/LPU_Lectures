package MapExpt;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
//        Map<String,String> eg = new HashMap<>();

        // inserting elements in a map
//        eg.put("SL","Sri Lanka");
//        eg.put("IN","India");
//        eg.put("CN","Canada");
//        eg.put("PL","Poland");

//

        // read the values
//        System.out.println(eg);
//        Set<String> key_coll = eg.keySet();
//        for(String key:key_coll){
//            System.out.println("the key = "+key+" value associated with it is = "+eg.get(key));
//        }

        // update
//        eg.put("IN","Bharat");
//        System.out.println(eg);

        //delete an element -> as soon as u delete a key the whole (key,value)
        // pair gets deleted

        // delete
//        eg.remove("CN");
//        System.out.println(eg);



        // all the keys in a map are unique
        // the values corresponding to the key can be updated


        // int -> Integer
        // boolean -> Boolean

        int[] arr = {1,1,2,3,1,1,7,5,4,3,2,7,8,3,2,6};
        Map<Integer,Integer> freq_map = new HashMap<>();
        Map<Integer,Integer> freq_map2 = new HashMap<>();

        for(int no:arr){

            freq_map.putIfAbsent(no,0);
            freq_map.put(no,freq_map.get(no)+1);
            // if(!freq_map.containsKey(no){freq_map.put(no,0)}
        }

        freq_map2.put(0,1);

//        System.out.println(freq_map.equals(freq_map2));
        System.out.println(freq_map);

//            freq_map.put(no, freq_map.getOrDefault(freq_map.get(no),0)+1);

    }
}
