package Model;

import java.util.ArrayList;

public class Sosa implements ISubject{


    ArrayList<Crush> crushes = new ArrayList<>();
    ArrayList<IObserver> iObservers = new ArrayList<>();

    public Sosa(){

        crushes.add(new Crush("G1",true));
        crushes.add(new Crush("G2",false));
        crushes.add(new Crush("G3",true));



    }

    public void haveNewInfo(){

        for(int  i = 0 ; i<iObservers.size();i++){
            iObservers.get(i).update(this.crushes);
        }

    }


    public void setNewInfo(String name, boolean single){
        for(Crush crush : crushes){
            if(crush.getName().equals(name)){
               crush.setSingle(single);
            }
        }
    }

    @Override
    public void subscribe(IObserver iObserver) {
        iObservers.add(iObserver);
    }

    @Override
    public void unsubscribe(IObserver iObserver) {
        for(IObserver iObserver1 : iObservers){
            if(iObserver == iObserver1)
                iObservers.remove(iObserver);
        }
    }
}
