package pb3;

public class HorrorMovieDiscounter implements Discounter{
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 0.9;
    }
}
