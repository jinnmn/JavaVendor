import java.time.LocalDate;

public class BottleOfWater extends Product {

    private float volume;
    public float getVolume() {
        return volume;
    }

    private Package puck;
    public Package getPuck() {
        return puck;
    }

    private boolean isGased;

    public boolean isGased() {
        return isGased;
    }

    public BottleOfWater(String name, Double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
    }
    


}
