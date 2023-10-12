package pb3;

public class ComedyMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 0.5;
    }
}
