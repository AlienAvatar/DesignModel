package BuliderModel;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void doSomething(){
        builder.bulidProduct1();
        builder.bulidProduct2();
    }
}
