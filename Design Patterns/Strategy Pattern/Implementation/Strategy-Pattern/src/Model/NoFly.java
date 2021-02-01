package Model;

public class NoFly implements Flyable{
    @Override
    public String fly() {
        return "Hey, I am no flying";
    }
}
