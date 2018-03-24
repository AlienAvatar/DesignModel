package StrategyModel.DoSomthing.impl;

import StrategyModel.DoSomthing.IActiveService;

public class ActiveService implements IActiveService {
    @Override
    public void drive() {
        System.out.println("The car is driving");
    }
}
