package com.overlord.designpatterns.observer;

/**
 * 抽象被观察者接口
 */
public interface Observerable {
    void registerObserver(Observers observers);
    void removeObservers(Observers observers);
    void notifyMessage(String message);
}
