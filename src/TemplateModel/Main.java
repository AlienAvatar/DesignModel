package TemplateModel;

public class Main {
    public static void main(String[] args) {
        Car benzCar = new Benz();
        benzCar.prepareRecipe();
        System.out.println("-----");
        benzCar = new BMW();
        benzCar.prepareRecipe();

    }
}
