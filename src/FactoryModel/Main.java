package FactoryModel;

import FactoryModel.FactoryMethod.BenzFactory;
import FactoryModel.FactoryMethod.CarFactory;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new BenzFactory();
        carFactory.driveCar("Benz");
    }
}
