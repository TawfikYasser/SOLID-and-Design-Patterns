package Model;

public abstract class Duck {
    private int id;
    private String name;
    private static int counter = 0;
    protected Flyable myFlyBehaviour;

    public Duck() {
        this.id = counter++;
        this.name = "Duck #"+this.id;
    }

    public String swim(){
        return "Hey, I am swimming";
    }

    protected abstract String display();

    public void perform(){

        System.out.println("Hey, I am "+this.name);
        System.out.println(this.swim());
        System.out.println(this.display());
        System.out.println(this.myFlyBehaviour.fly());
    }
}
