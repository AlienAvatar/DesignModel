package FactoryModel.FactoryFun;

public class Client {
    private static Car benzCar,bmwCar;
    private static abstractFactory benzFactory,bwmFactory;

    public static void main(String[] args) throws Exception {
        benzFactory = new benzFactory();
        benzCar = benzFactory.driveFactory();

        benzCar.drive();
        System.out.println("----");

        bwmFactory = new bwmFactory();
        bmwCar = bwmFactory.driveFactory();

        bmwCar.drive();
    }
}
