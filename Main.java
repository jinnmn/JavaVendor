import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product bottle1 = new BottleOfWater("нарзан", 55.0, LocalDate.of(2024, 1, 22));
        BottleOfWater bottle2 = new BottleOfWater("voda", 10.0, LocalDate.now(), 1.5f,  Package.GLASS.getName(), true);
        BottleOfWater bottle3 = new BottleOfWater();
        System.out.println(bottle1);
        System.out.println(bottle2);
        System.out.println(bottle3);
        
        Vendor vm = new WaterVendor();
        vm.addGoods(List.of(bottle1, bottle1, bottle1, bottle2, bottle3));
        System.out.println(vm.getGoods());

            
    }
    

}
