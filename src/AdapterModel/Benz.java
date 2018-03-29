package AdapterModel;

public class Benz implements Car {
    Music music;

    public Benz(){
        music = new Music();
    }
    @Override
    public void drive() {
        System.out.println("Benz is driving");
        music.sportMusic();
    }
}
