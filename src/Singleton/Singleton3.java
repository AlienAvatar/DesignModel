package Singleton;

public class Singleton3 {
    public Singleton3(){}
    private static class SingletonHolder{
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonHolder.singleton3;
    }
}
