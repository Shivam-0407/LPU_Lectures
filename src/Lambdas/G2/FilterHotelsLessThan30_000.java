package Lambdas.G2;

public class FilterHotelsLessThan30_000 implements FilterCondition{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.getPricePerNight()<=30000;
    }
}
