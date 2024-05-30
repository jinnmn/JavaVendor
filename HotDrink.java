import java.time.LocalDate;

public class HotDrink extends Product {
    private String puck;
    private float volume;
    private int tempr;

    public HotDrink(String puck, float volume, int tempr) {
        this.puck = puck;
        this.volume = volume;
        this.tempr = tempr;
    }

    public HotDrink(String name, Double price, LocalDate releaseDate, String puck, float volume, int tempr) {
        super(name, price, releaseDate);
        this.puck = puck;
        this.volume = volume;
        this.tempr = tempr;
    }

    public String getPuck() {
        return puck;
    }
    
    public float getVolume() {
        return volume;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }
    public int getTempr() {
        return tempr;
    }
    public void setTempr(int tempr) {
        this.tempr = tempr;
    }

    @Override
    public String toString() {
        return "HotDrink [name=" + this.getName() 
        + ", price=" + this.getPrice()
         + ", releaseDate=" + this.getReleaseDate()
          + ", volume=" + volume +
           ", puck=" + puck +
           "tempr=" + tempr + "]" +"\n"; 
    }

    
}
