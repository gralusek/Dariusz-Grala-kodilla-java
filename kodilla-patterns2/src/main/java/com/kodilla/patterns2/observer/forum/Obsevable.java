package com.kodilla.patterns2.observer.forum;

public interface Obsevable {
    void registerObserver(Observer observer);
    void notifyObserver();
    void removeObserver(Observer observer);
}
