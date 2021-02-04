import Model.DinnerMenu;
import Model.Menu;
import Model.PanMenu;
import Model.Waiter;
/**
 * @author Tawfik Yasser
 * @since 2021
 * */
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new PanMenu());
        menus.add(new DinnerMenu());
        Waiter waiter = new Waiter(menus);
        waiter.printMenu();
    }
}
