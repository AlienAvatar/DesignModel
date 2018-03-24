package StrategyModel;

import StrategyModel.DoSomthing.IActiveService;
import StrategyModel.DoSomthing.impl.ActiveService;

public class BMW extends Car {

    public static void main(String[] args) {
        Car bmw = new BMW();
//        bmw.setActiveService(new ActiveService());
        bmw.drive();
        bmw.BMWmusic();
    }
}
