package Lambdas.G1;

import java.util.*;

public class Main {
    static class Pair{
        int no;
        int freq;

        public Pair(int no, int freq) {
            this.no = no;
            this.freq = freq;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "no=" + no +
                    ", freq=" + freq +
                    '}';
        }
    }

//    public List<Hotel> testLamb(){
//        HotelService hs = new HotelService();
//        FilteringCondition fn = (hotel)-> {
////            this -> is currently pointing to Main class
//            return hotel.pricePerNight <= 20000;
//        };
//
//        return hs.filterHotels(fn);
//    }
//
    public static void main(String[] args) {
//        HotelService hs = new HotelService();
//
//
////        List<Hotel> hlist3 = hs.filterHotels(new FilteringCondition() {
////            @Override
////            public boolean test(Hotel hotel) {
////                return hotel.getHotelType()==HotelType.FOUR_STAR;
////            }
////
////
////        });
//
//    FilteringCondition fn = (hotel)->hotel.getHotelType()==HotelType.FOUR_STAR;
//    List<Hotel> hlist = hs.filterHotels(fn);
//
//        List<Integer> ls = new ArrayList<>();
//        for(int i=0;i<5;i++){
//            ls.add(i);
//        }
//
//        Collections.sort(ls,(a,b)->{
//            return b-a;
//        });
////
////        Collections.sort(ls, new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                return o2-o1;
////            }
////        });
//
//
//
//
//        System.out.println(ls);
//        System.out.println(hlist);

        // [3,3,3,1,2,3,4,4,1,2,5,1,4,5]
        // sort the array based on foll condition-
        // nos. appearing for the least amount of time should appear first
        // 3->4,1->3,2->2,4->3,5->2
        // [2,2,5,5,4,4,1,1,3,3,3,3]

        int [] arr = {3,3,3,1,2,3,4,4,1,2,5,1,4,5};
        int freq[] = new int[6]; // coz indexing starts from 0

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        List<Pair> list = new ArrayList<>();

        for(int i=1;i< freq.length;i++){
            list.add(new Pair(i,freq[i]));
        }
        System.out.println(list);

        list.sort((Pair a, Pair b)->{
            if(a.freq==b.freq){
                return a.no-b.no;
            }
            return a.freq-b.freq;
        });

        System.out.println("after sorting -> "+list);

        int []res = new int[arr.length];
        int indx=0;
        for(int i=0;i<list.size();i++){
            int no= list.get(i).no;
            int fr = list.get(i).freq;

            while(fr>0){
               res[indx++]=no;
                fr--;
            }
        }

        System.out.println(Arrays.toString(res));

    }
}
