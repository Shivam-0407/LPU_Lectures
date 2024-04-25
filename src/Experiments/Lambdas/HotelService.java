package Experiments.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    List<Hotel>hotels = new ArrayList<>();

    public HotelService() {
       hotels.add(new Hotel(2000,3,HotelType.THREE_STAR));
       hotels.add(new Hotel(5000,4,HotelType.FOUR_STAR));
       hotels.add(new Hotel(25000,5,HotelType.FIVE_STAR));
       hotels.add(new Hotel(2100,3,HotelType.THREE_STAR));
       hotels.add(new Hotel(32000,5,HotelType.FIVE_STAR));
    }

    //filter for hotels

//    private boolean isHotellessThan(int price, Hotel hotel) {
//        return  hotel.pricePerNight<=price;
//    }
//
//    public List<Hotel> filterHotelLessThan(int price){
//        List<Hotel> filteredHotels = new ArrayList<>();
//
//        for(Hotel hotel:hotels) {
//            if (isHotellessThan(price, hotel))
//                filteredHotels.add(hotel);
//        }
//        return filteredHotels;
//    }
//
//    public List<Hotel> filterHotelByStar(int price){
//        List<Hotel> filteredHotels = new ArrayList<>();
//
//        for(Hotel hotel:hotels) {
//            if (isHotel5Star(hotel))
//                filteredHotels.add(hotel);
//        }
//        return filteredHotels;
//    }
//
//    private boolean isHotel5Star(Hotel hotel) {
//        return hotel.hotelType==HotelType.FIVE_STAR;
//    }

    public List<Hotel> filterHotels(FilteringConditon filteringConditon){
        List<Hotel> filteredHotels = new ArrayList<>();

        for(Hotel hotel:hotels) {
            if (filteringConditon.test(hotel))
                filteredHotels.add(hotel);
        }
        return filteredHotels;
    }



}

