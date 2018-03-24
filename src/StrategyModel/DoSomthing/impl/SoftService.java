package StrategyModel.DoSomthing.impl;

import StrategyModel.DoSomthing.ISoftService;

public class SoftService implements ISoftService {
    @Override
    public void music() {
        System.out.println("play music");
    }

    @Override
    public void BMWmusic() {
        System.out.println("BMW play music");
    }

    @Override
    public void Benzmusic() {
        System.out.println("Benz play music");
    }


}
