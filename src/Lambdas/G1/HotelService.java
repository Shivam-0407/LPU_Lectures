package Lambdas.G1;


import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel>hotels = new ArrayList<>();

    public HotelService() {
       hotels.add(new Hotel(2000,3, HotelType.THREE_STAR));
       hotels.add(new Hotel(5000,4,HotelType.FOUR_STAR));
       hotels.add(new Hotel(25000,5,HotelType.FIVE_STAR));
       hotels.add(new Hotel(2100,3,HotelType.THREE_STAR));
       hotels.add(new Hotel(32000,5,HotelType.FIVE_STAR));
    }

    private boolean isHotelLessThan(int price, Hotel hotel) {
        return hotel.pricePerNight<=price;
    }
    // here we're filtering hotels based on their prices
//    public List<Hotel> filterHotelsByPrice(int price){
//        List<Hotel> hotelList = new ArrayList<>();
//
//        for(Hotel hotel:hotels){
//            if(isHotelLessThan(price,hotel)){
//                hotelList.add(hotel);
//            }
//        }
//
//        return hotelList;
//    }
//
//    public List<Hotel> filter5StarHotels(int price){
//        List<Hotel> hotelList = new ArrayList<>();
//
//        for(Hotel hotel:hotels){
//            if(isHotel5star(hotel)){
//                hotelList.add(hotel);
//            }
//        }
//
//        return hotelList;
//    }
//
//    private boolean isHotel5star(Hotel hotel) {
//        return hotel.getHotelType()==HotelType.FIVE_STAR;
//    }


    public List<Hotel> filterHotels(FilteringCondition fc){
        List<Hotel> hotelList = new ArrayList<>();

        for(Hotel hotel:hotels){
            if(fc.test(hotel)){
                hotelList.add(hotel);
            }
        }

        return hotelList;
    }


}

