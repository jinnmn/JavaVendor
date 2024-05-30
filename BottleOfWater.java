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

        
    public BottleOfWater(String name, Double price, LocalDate releaseDate, float volume, Package puck,
            boolean isGased) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.puck = puck;
        this.isGased = isGased;
    }

    public BottleOfWater(String name, Double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.volume = 0;
        this.puck = null;
        this.isGased  = false;
    }

    public BottleOfWater() {
        }

    public boolean isGased() {
        return isGased;
    }

    @Override
    public String toString() {
        return "BottleOfWater [name=" + this.getName() + ", price=" + this.getPrice() + ", releaseDate=" + this.getReleaseDate() + ", volume=" + volume + ", puck=" + puck + ", isGased=" + isGased + "]";
    }

    
   


}
