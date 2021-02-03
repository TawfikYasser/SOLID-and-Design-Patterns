import Model.ActiveObserver;
import Model.ShyObserver;
import Model.Sosa;

public class Main {
    public static void main(String args[]){
        Sosa sosa = new Sosa();
        ActiveObserver activeObserver = new ActiveObserver(sosa);
        ActiveObserver activeObserver1 = new ActiveObserver(sosa);
        ShyObserver shyObserver = new ShyObserver(sosa);
        sosa.subscribe(activeObserver);
        sosa.subscribe(activeObserver1);
        sosa.subscribe(shyObserver);
        sosa.haveNewInfo();
        activeObserver1.iSubject.unsubscribe(activeObserver1);
        System.out.println("After unsub");
        sosa.setNewInfo("G1",false);
        sosa.haveNewInfo();

    }
}
