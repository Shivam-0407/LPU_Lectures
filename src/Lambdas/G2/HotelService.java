package Lambdas.G2;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel>hotels = new ArrayList<>();

    public HotelService() {
       hotels.add(new Hotel(2000,3, HotelType.THREE_STAR));
       hotels.add(new Hotel(5000,4, HotelType.FOUR_STAR));
       hotels.add(new Hotel(25000,5, HotelType.FIVE_STAR));
       hotels.add(new Hotel(2100,3, HotelType.THREE_STAR));
       hotels.add(new Hotel(32000,5, HotelType.FIVE_STAR));
    }

//    public List<Hotel> filterHotelsLessThan(int price){
//        List<Hotel> filteredHotels  = new ArrayList<>();
//
//        for(Hotel hotel:hotels){
//            if(hotelLessThan(price,hotel)){
//                filteredHotels.add(hotel);
//            }
//        }
//
//        return filteredHotels;
//    }
//
//    private boolean hotelLessThan(int price, Hotel hotel) {
//        return hotel.getPricePerNight()<=price;
//    }
//
//    public List<Hotel> filter5StarHotels(){
//        List<Hotel> filteredHotels  = new ArrayList<>();
//
//        for(Hotel hotel:hotels){
//            if(is5star(hotel)){
//                filteredHotels.add(hotel);
//            }
//        }
//
//        return filteredHotels;
//    }
//
//    private boolean is5star(Hotel hotel) {
//        return hotel.getHotelType()==HotelType.FIVE_STAR;
//    }

    public List<Hotel> filteringMethod(FilterCondition fn){
        List<Hotel> filteredHotels  = new ArrayList<>();

        for(Hotel hotel:hotels){
            if(fn.test(hotel)){
                filteredHotels.add(hotel);
            }
        }

        return filteredHotels;
    }

}

