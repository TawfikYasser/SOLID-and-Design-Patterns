package Model;

public class Crush {
    String name;
    boolean single;

    public Crush(String name, boolean single) {
        this.name = name;
        this.single = single;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
}
