package FactoryModel;

public class DriveFactory {
    public static Car bulider(String car){
        if(car.equals("benz")){
            return new Benz();
        }else if(car.equals("bmw")){
            return new BMW();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Car car = bulider("benz");
        car.drive();
    }
}
