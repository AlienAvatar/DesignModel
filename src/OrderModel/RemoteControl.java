package OrderModel;

public class RemoteControl {
    Command slot;

    public RemoteControl(){}

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonDriveBenz(){
        slot.excute();
    }
}
