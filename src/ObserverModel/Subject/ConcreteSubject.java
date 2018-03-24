package ObserverModel.Subject;

import ObserverModel.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    List<Observer> observers;

    public ConcreteSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        for(int i = 0; i < observers.size(); i++){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer bean : observers){
            bean.update();
        }
    }
}
