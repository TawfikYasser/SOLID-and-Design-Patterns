public class Singleton {


    private Singleton() {
    }

    /*

    1. Egar Solution

    private static Singleton unique = new Singleton();

    public static Singleton getInstance(){
        return unique;
    }
////////////////////////////////////////////////////////////////////////////////
    2. Lazy Solution
    private static Singleton unique;

    public static Singleton getInstance(){
        if(unique==null)
            unique = new Singleton();
        return unique;
    }

    */


    //3. Synchronization Solution with multi-threading

    private static volatile Singleton unique;

    public static Singleton getInstance(){
        if (unique==null){

            synchronized (Singleton.class){

                if(unique == null){
                    unique = new Singleton();
                }else {
                    return unique;
                }

            }
        }
        return unique;
    }

}
