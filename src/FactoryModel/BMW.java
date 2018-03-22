package FactoryModel;

public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }
}
