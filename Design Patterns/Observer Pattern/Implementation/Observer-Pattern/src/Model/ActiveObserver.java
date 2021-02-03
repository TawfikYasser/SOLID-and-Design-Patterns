package Model;

import java.util.ArrayList;

public class ActiveObserver implements IObserver{

    public ISubject iSubject;

    public ActiveObserver(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void update(ArrayList<Crush> crushes) {
        System.out.println("Hey, There are new data: ");
        for(Crush crush : crushes){
            System.out.println(crush.getName() + " - "+ crush.isSingle());
        }
    }
}
