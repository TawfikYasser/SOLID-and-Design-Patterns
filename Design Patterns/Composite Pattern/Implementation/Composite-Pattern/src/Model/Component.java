package Model;

public abstract class Component {

    public abstract void printComponentInfo(int level);
    public void addComponent (Component component){
        throw new UnsupportedOperationException();
    }

}
