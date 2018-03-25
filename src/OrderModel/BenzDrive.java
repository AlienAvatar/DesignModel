package OrderModel;

public class BenzDrive implements Command {

    Benz benz;

    public BenzDrive(Benz benz){
        this.benz = benz;
    }

    @Override
    public void excute() {
        benz.dirve();
    }
}
