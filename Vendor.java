import java.util.ArrayList;
import java.util.List;

public abstract class Vendor {

    protected static List<Product> goods; 
    
    public Vendor(List<Product> goods) {
        Vendor.goods = goods;        
    }

    public Vendor() {
        Vendor.goods = new ArrayList<>();        
    }

    public List<Product> getGoods() {
        return goods;
    }

    public void addGoods(List<Product> goods) {
        Vendor.goods.addAll(goods);        
    }

    public Product getProduct(String name) {
        for (Product product : goods) {
            if (product.getName().equals(name)) {
                Product item = product;
                goods.remove(product);
                return item;
            }
        } return null;
}
}
