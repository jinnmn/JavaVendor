import java.util.List;

public class HotWaterVendor extends Vendor {

    public static final String HotWaterVendor = null;

    public HotWaterVendor(List<Product> goods) {
        super(goods);
    }

    public HotWaterVendor() {
    }
    
    
   
    public static HotDrink getProduct(String name, float volume, int temperature) {
        for (Product product : goods) {
            HotDrink x = (HotDrink) product;
            if (x.getName().equals(name)) {
                
                HotDrink item = x;
                goods.remove(product);
                return item;
            }
        } return null;
    }

    
}
