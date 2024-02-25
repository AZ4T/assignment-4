package Observer;

import java.util.ArrayList;
import java.util.List;

public class Notifications implements Observed{
    List<String> not = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addNot(String notion) {
        this.not.add(notion);
        notifyObservers();
    }

    public void removeNot(String notion) {
        this.not.remove(notion);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:subscribers){
            observer.notifyEvent(this.not);
        }
    }
}