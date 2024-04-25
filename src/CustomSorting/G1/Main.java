package CustomSorting.G1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
   static class Pair{
        int no;
        int freq;

        public Pair(int no,int f) {
            this.no = no;
            this.freq = f;
        }

       @Override
       public String toString() {
           return "Pair{" +
                   "no=" + no +
                   ", freq=" + freq +
                   '}';
       }
   }
    public static void main(String[] args) {
        int[] arr = {3,3,1,2,4,2,5,4,5,1,1,1,5};

        //custom sorting - > we want to sort based on the frequency
        // in which nos. having least freq. comes first
        // eg. {3,3,1,2,4,2,5,4,5,1,1,1,5}; -> 3-2 , 1-4, 2-2 ,4-2 , 5-3
         // 3,3,4,4,2,2,5,5,5,1,1,1,1;

        int freq[] = new int[6];

        for(int i=0;i< arr.length;i++){
            freq[arr[i]]++;
        }
        //System.out.println(Arrays.toString(freq));


       List<Pair> list = new ArrayList<>();

        for(int i=1;i<freq.length;i++){
            list.add(new Pair(i,freq[i]));
        }


        System.out.println(list);

        list.sort((a,b)->{
            return b.freq-a.freq;
        });

        int sorted_arr[] = new int[arr.length];
        int indx = 0;
        for(int i=0;i<list.size();i++){
            int fr = list.get(i).freq;
            int no = list.get(i).no;
            while(fr>0){
                sorted_arr[indx++] = no;
                fr--;
            }
        }

        System.out.println("After sorting -> "+Arrays.toString(sorted_arr));
    }
}
