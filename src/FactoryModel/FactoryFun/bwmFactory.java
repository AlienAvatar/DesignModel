package FactoryModel.FactoryFun;

public class bwmFactory implements abstractFactory {
    @Override
    public Car driveFactory() {
        return new bmwCar();
    }
}
