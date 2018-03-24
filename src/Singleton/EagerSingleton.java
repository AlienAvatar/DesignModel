package Singleton;


/**
 * 饥饿模式，静态初始化
 */
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    public EagerSingleton(){}

    private static EagerSingleton getInstance(){
        return singleton;
    }
}
