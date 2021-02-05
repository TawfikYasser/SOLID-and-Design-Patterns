import Model.Component;
import Model.Department;
import Model.Employee;

public class Main {
    public static void main(String[] args){
        Component e1 = new Employee("E1");
        Component e2 = new Employee("E2");
        Component e3 = new Employee("E3");
        Component e5 = new Employee("E4");
        Component d1 = new Department("D1");
        Component d2 = new Department("D2");
        Component d3 = new Department("D3");


        d1.addComponent(e1);
        d1.addComponent(e2);
        d1.addComponent(e3);
        d2.addComponent(e1);
        d2.addComponent(e2);
        d3.addComponent(d2);
        d3.addComponent(e3);

        d1.printComponentInfo(1);
    }
}
