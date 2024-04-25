package Experiments.Lambdas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();
        List<Hotel> hotels = hotelService.filterHotels(new FilterHotelsLessThan30000());
        List<Hotel> hotels2 = hotelService.filterHotels((Hotel hotel)->{
            return hotel.hotelType==HotelType.FIVE_STAR;
        });
        System.out.println(hotels);
        System.out.println(hotels2);
    }
}
