package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable{
    private final String name;
    private final List<String> homework;
    private final List<Observer> observers;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        homework = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        homework.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<String> getHomework() {
        return homework;
    }
}
