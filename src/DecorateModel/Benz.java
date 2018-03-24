package DecorateModel;

public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("The Benz is dirving");
    }


    protected Car car;
}
