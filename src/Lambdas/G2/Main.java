package Lambdas.G2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public int fees;
    public List<Hotel> testLamb(){
        HotelService hs = new HotelService();
        FilterCondition fc = h->{
            this.fees = 10000;
            return h.getHotelType() == HotelType.THREE_STAR;
        };

        return hs.filteringMethod(fc);
    }


    public static void main(String[] args) {
        HotelService hs  = new HotelService();

        List<Hotel> filteredList = hs.filteringMethod(new FilterHotelsLessThan30_000());
        List<Hotel> filteredList2 = hs.filteringMethod(new FilterCondition() {
            @Override
            public boolean test(Hotel hotel) {
                return hotel.getHotelType()==HotelType.FIVE_STAR;
            }
        });
        FilterCondition lambdaExp = h->h.rating>=4;
        List<Hotel> filteredList3 = hs.filteringMethod(lambdaExp);

        List<Double> list = new ArrayList<>();
        list.add(0.5);
        list.add(0.45);
        list.add(0.335);
        list.add(0.25);
        list.add(0.105);
        list.add(0.235);
        list.add(0.235);

        System.out.println("Before sorting "+list);



//        list.sort(new Comparator<D>() {
//            @Override
//            public int compare(Double o1, Double o2) {
//                if(o1-o2>0){
//                    return 1;
//                }else if(o1-o2<0){
//                    return -1;
//                }
//                return 0;
//            }
//        });

        list.sort((Double o1, Double o2)-> {
            if(o1-o2>0){
                return -1;
            }else if(o1-o2<0){
                return 1;
            }
            return 0;
        });

        System.out.println("After sorting "+list);

//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        }); // sorting in descending manner



//
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        list.sort((Integer o1, Integer o2)-> {
//            return o2-o1;
//        }
//    );



      //  System.out.println("After = "+list);


//
//        System.out.println("After = "+list);

   //     System.out.println(filteredList3);
    }
}
