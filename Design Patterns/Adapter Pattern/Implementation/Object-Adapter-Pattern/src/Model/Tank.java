package Model;

public class Tank implements Enemy{

    @Override
    public void fire() {
        System.out.println("Tank: fire()");
    }

    @Override
    public void fill() {
        System.out.println("Tank: fill()");
    }
}
