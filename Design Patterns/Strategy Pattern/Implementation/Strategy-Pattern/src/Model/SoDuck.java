package Model;

public class SoDuck extends Duck{

    @Override
    protected String display() {
        return "Hey, I am SoDuck";
    }
    public SoDuck(){
        super();
        this.myFlyBehaviour = new FlyWithWings();
    }
    public void gotShot(){
        System.out.println("Got shot -> No Fly");
        this.myFlyBehaviour = new NoFly();
    }
}
