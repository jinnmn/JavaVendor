import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotDrink coffe = new HotDrink("coffe", 100.0, LocalDate.of(2024, 6, 30)
        , Package.PAPER.getName(), 0.5f, 90);
        HotDrink tea = new HotDrink("tea", 80.0, LocalDate.of(2024, 6, 30)
        , Package.PAPER.getName(), 0.5f, 85);

        HotWaterVendor vm = new HotWaterVendor();
        vm.addGoods(List.of(tea, tea, tea, coffe, coffe));
        System.out.println(vm.getGoods());
        // vm.getProduct("voda");
        // System.out.println(vm.getGoods());


            
    }
    

}
