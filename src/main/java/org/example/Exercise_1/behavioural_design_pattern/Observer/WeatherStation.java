package org.example.Exercise_1.behavioural_design_pattern.Observer;

// WeatherStation class that extends Subject to manage temperature updates.
public class WeatherStation extends Subject {
    private float temperature; // Current temperature.

    // Sets the temperature and notifies observers of the change.
    public void setTemperature(float temperature) {
        this.temperature = temperature; // Update the temperature.
        notifyObservers(temperature); // Notify all observers about the new temperature.
    }
}
