package Experiments.Lambdas;

public class FilterHotelsLessThan30000 implements FilteringConditon{
    @Override
    public boolean test(Hotel hotel) {
        return hotel.pricePerNight<=30000;
    }
}
