package FactoryModel.AbstractFactory;

public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }

    @Override
    public Type createType() {
        return new BenzDoor();
    }
}
