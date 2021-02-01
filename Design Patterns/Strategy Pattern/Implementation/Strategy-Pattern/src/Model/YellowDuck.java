package Model;

public class YellowDuck extends Duck{
    @Override
    protected String display() {
        return "Hey, I am Yellow Duck";
    }

    public YellowDuck(){
        super();
        this.myFlyBehaviour = new NoFly();
    }

}
