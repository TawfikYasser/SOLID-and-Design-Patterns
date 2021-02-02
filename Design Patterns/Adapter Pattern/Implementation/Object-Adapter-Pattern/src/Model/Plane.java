package Model;

public class Plane implements Enemy{
    @Override
    public void fire() {
        System.out.println("Plane: fire()");
    }

    @Override
    public void fill() {
        System.out.println("Plane: fill()");
    }
}
