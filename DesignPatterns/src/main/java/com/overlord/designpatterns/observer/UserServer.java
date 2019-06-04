package com.overlord.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者类
 */
public class UserServer implements Observerable {
    private List<Observers> observersList;
    public UserServer(){
        observersList = new ArrayList<Observers>();
    }
    public void registerObserver(Observers observers) {
        observersList.add(observers);
    }

    public void removeObservers(Observers observers) {
        observersList.remove(observers);
    }

    public void notifyMessage(final String message) {
        observersList.forEach( observer ->
                observer.updateInfo(message));
    }
}
