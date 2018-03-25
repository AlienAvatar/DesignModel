package OrderModel;

public class Main {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Benz benz = new Benz();
        BenzDrive benzDrive = new BenzDrive(benz);
        control.setSlot(benzDrive);
        control.buttonDriveBenz();
    }
}
