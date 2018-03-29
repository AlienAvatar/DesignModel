package TemplateModel;

public abstract class Car {
    final void prepareRecipe() {
        drive();
        music();
        doSomething();
    }

    abstract void doSomething();

    void drive() {
        System.out.println("The car is driving");
    }

    void music() {
        System.out.println("music");
    }

    void hock(){

    }

}
