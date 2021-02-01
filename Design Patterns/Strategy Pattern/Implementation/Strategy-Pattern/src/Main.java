import Model.Duck;
import Model.SoDuck;
import Model.YellowDuck;
/**
 * @author Tawfik Yasser
 * @since 2021
 * */
public class Main {
    public static void main(String args[]){

        Duck d1 = new SoDuck();
        d1.swim();
        d1.perform();

        Duck d2 = new YellowDuck();
        d2.swim();
        d2.perform();

        ((SoDuck)d1).gotShot();
        d1.perform();
    }
}
