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

    public void addGoods(List<Product> goods) {
        this.goods.addAll(goods);        
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
