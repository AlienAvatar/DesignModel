package Singleton;


/**
 *
 */
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    public EagerSingleton(){}

    private static EagerSingleton getInstance(){
        return singleton;
    }
}
