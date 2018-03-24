package StrategyModel;

import StrategyModel.DoSomthing.IActiveService;
import StrategyModel.DoSomthing.ISoftService;
import StrategyModel.DoSomthing.impl.ActiveService;
import StrategyModel.DoSomthing.impl.SoftService;

public abstract class  Car {
     IActiveService iActiveService;
     ISoftService iSoftService;

     public Car(){
         iActiveService = new ActiveService();
         iSoftService = new SoftService();
     }

     public void drive(){
         iActiveService.drive();
     }

     public void BMWmusic(){
         iSoftService.BMWmusic();
     }

     public void Benzmusic(){
         iSoftService.Benzmusic();
     }
}
