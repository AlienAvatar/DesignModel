package Singleton;

public class Singleton2 {
    private static Singleton2 singleton2 = null;

    public Singleton2(){}

    public static Singleton2 getInstance(){
        //先检查实例是否存在，如果不存在进行才进行下面实例化
        if(singleton2 == null){
            //同步块，线程安全的创建实例
            synchronized (Singleton2.class){
                //再次检查实例是否存在，若不存在创建真正实例
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
