import java.util.ArrayList;
import java.util.List;

public class Vendor {

    private List<Product> goods; 
    
    public Vendor(List<Product> goods) {
        this.goods = goods;        
    }

    public Vendor() {
        this.goods = new ArrayList<>();        
    }

    public List<Product> getGoods() {
        return goods;
    }
}
