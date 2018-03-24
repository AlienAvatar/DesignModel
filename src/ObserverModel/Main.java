package ObserverModel;

import ObserverModel.Observer.ConcreteObserver;
import ObserverModel.Subject.ConcreteSubject;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(subject);
        concreteObserver.update();
    }
}
