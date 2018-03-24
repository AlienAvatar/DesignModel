package ObserverModel.Observer;

import ObserverModel.Observer.Observer;
import ObserverModel.Subject.Subject;

public class ConcreteObserver implements Observer {
    private Subject subject;

    public ConcreteObserver(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("update()");
    }

    @Override
    public void update(Observer o) {
        System.out.println("update(Observer o)");
    }
}
