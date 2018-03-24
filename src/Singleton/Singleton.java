package Singleton;

/**
 * 双重加锁
 */
public class Singleton {
    private static Singleton singleton = null;
    public Singleton(){}

    public static synchronized Singleton getInstance(){
        if(singleton == null){
            return new Singleton();
        }
        return singleton;
    }
}
