package Experiments.Lambdas;

public class Filter5StarHotels implements FilteringConditon{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.hotelType==HotelType.FIVE_STAR;
    }
}
