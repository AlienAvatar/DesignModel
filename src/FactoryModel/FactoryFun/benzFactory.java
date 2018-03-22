package FactoryModel.FactoryFun;

public class benzFactory implements abstractFactory {
    @Override
    public Car driveFactory() {
        return new benzCar();
    }
}
