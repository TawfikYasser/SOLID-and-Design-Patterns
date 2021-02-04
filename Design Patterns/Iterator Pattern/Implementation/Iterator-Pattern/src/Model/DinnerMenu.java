package Model;

import java.util.ArrayList;

public class DinnerMenu implements Menu{


    static final int MAX_ITEMS = 4 ;
    int numberOfItems = 0;
    Object[] menuItems;

    public DinnerMenu() {

        menuItems = new Object[MAX_ITEMS];
        addItem(new MenuItem("D1"));
        addItem(new MenuItem("D2"));
        addItem(new MenuItem("D3"));
        addItem(new MenuItem("D4"));
    }

    public void addItem(MenuItem menuItem){

        if(numberOfItems >= MAX_ITEMS){
            System.err.println("Array out of bounds");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }

    }

    @Override
    public Iterator getIterator() {
        Iterator iterator = new ArrayIterator(this.menuItems);
        return iterator;
    }
}
