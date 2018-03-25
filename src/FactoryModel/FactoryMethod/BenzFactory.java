package FactoryModel.FactoryMethod;

public class BenzFactory implements CarFactory {
    @Override
    public Car driveCar(String item) {
        Car car = null;
        if(item.equals("Benz")){
            car = new Benz();
        }else if(item.equals("BMW")){
            car = new BMW();
        }else {
            throw new UnsupportedOperationException();
        }
        car.drive();
        return car;
    }
}
