import Model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        ArrayList<Enemy> enemies = new ArrayList<>();
        //1.
        enemies.add(new Tank());
        enemies.add(new Plane());

        //2.
        enemies.add(new GoAdapter(new Go()));

        for(Enemy enemy: enemies){
            enemy.fire();
            enemy.fill();
        }

    }

}
