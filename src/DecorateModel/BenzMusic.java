package DecorateModel;

public class BenzMusic extends Benz {
    public BenzMusic(Car car){
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("Benz music car");
    }
}
