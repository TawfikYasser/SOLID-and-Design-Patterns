package Model;

import java.util.ArrayList;

public class Department extends Component{
    String name;
    ArrayList<Component> componentArrayList = new ArrayList<>();
    public Department(String name) {
        this.name = name;
    }

    @Override
    public void printComponentInfo(int level) {

        for (int i = 0 ;i< level;i++)
            System.out.print("+");
        System.out.println(this.name + ": My child { ");
        for (Component component: componentArrayList) {
            component.printComponentInfo(level+1);
        }

    }

    public void addComponent(Component component){
        componentArrayList.add(component);
    }
}
