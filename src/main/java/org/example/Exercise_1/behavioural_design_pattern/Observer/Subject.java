package org.example.Exercise_1.behavioural_design_pattern.Observer;

import java.util.ArrayList;
import java.util.List;

// Subject class to manage observers and notify them of changes.
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>(); // List of registered observers.

    // Adds an observer to the list.
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Removes an observer from the list.
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifies all observers of the temperature change.
    public void notifyObservers(float temperature) {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
