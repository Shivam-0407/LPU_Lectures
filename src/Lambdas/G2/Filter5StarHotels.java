package Lambdas.G2;

public class Filter5StarHotels implements FilterCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getHotelType()==HotelType.FIVE_STAR;
    }
}
