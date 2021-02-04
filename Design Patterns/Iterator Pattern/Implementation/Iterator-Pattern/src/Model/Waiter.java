package Model;

import java.util.ArrayList;

public class Waiter {
    ArrayList<Menu> menus;

    public Waiter(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu(){
        java.util.Iterator its = menus.iterator();
        while (its.hasNext()){
            printMenu(((Menu)its.next()).getIterator());
        }
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(((MenuItem)iterator.next()).getItemName());
        }
    }
}
