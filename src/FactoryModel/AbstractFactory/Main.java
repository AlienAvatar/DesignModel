package FactoryModel.AbstractFactory;

public class Main {
    private static CarFactory carFactory;

    public  Main(){
        carFactory = new BenzFactory();
    }

    public static void main(String[] args) {
        carFactory = new BenzFactory();
        Car car = carFactory.createCar();
        car.drive();
        Type type = carFactory.createType();
        type.door();
    }
}
