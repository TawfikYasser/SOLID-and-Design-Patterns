package Model;

public class GoAdapter implements Enemy{

    private Go go;

    public GoAdapter(Go go) {
        this.go = go;
    }

    @Override
    public void fire() {
        this.go.Go1();
    }

    @Override
    public void fill() {
        this.go.Go2();
    }
}
