package DecorateModel;

public class Main {

    public static void main(String[] args) {
        Car benz = new BMW();
        benz = new BenzMusic(benz);
        benz.drive();
    }
}
