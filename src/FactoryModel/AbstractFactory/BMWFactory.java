package FactoryModel.AbstractFactory;

public class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BMW();
    }

    @Override
    public Type createType() {
        return new BMWDoor();
    }
}
