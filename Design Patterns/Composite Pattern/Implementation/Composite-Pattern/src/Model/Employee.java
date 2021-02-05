package Model;

public class Employee extends Component{
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void printComponentInfo(int level) {

        for (int i = 0 ;i< level;i++)
            System.out.print("-");
        System.out.println(this.name);
    }
}
