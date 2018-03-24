package ObserverModel.Subject;

import ObserverModel.Observer.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
