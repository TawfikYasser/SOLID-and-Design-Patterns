package Model;

import java.util.ArrayList;

public class PanMenu implements Menu{

    ArrayList<Object> menuItems;

    public PanMenu() {

        menuItems = new ArrayList<>();

        addItem(new MenuItem("P1"));
        addItem(new MenuItem("P2"));
        addItem(new MenuItem("P3"));
        addItem(new MenuItem("P4"));

    }

    public void addItem(MenuItem menuItem){

        menuItems.add(menuItem);

    }

    @Override
    public Iterator getIterator() {
        Iterator iterator = new ArrayListIterator(this.menuItems);
        return iterator;
    }
}
