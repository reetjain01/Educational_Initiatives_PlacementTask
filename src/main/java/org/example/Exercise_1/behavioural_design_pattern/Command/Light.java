package org.example.Exercise_1.behavioural_design_pattern.Command;

// Light class to represent a light with basic on/off functionality.
public class Light {
    private boolean isOn = false; // Keeps track of whether the light is on or off.

   // Turns the light on.
    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON");
    }

    // Turns the light off.
    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }

    /**
     * Checks if the light is on.
     * @return true if the light is on, false otherwise.
     */
    public boolean isOn() {
        return isOn;
    }
}
