/**
 * @author Tawfik Yasser
 * @since 2021
 * **/
public class Main extends Thread{
    public static void main(String[] args){
        for (int i = 0 ; i < 20 ;i++){
            Main main = new Main();
            main.start();
        }
    }
    public void run(){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
