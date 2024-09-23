package org.example.Exercise_1.behavioural_design_pattern.Observer;

// DisplayScreen class that implements the Observer interface.
public class DisplayScreen implements Observer {
    private String name; // Name of the display screen.

    // Constructor to initialize the display screen's name.
    public DisplayScreen(String name) {
        this.name = name;
    }

    // This method is called when the temperature is updated.
    @Override
    public void update(float temperature) {
        System.out.println(name + " received temperature update: " + temperature + "°C");
    }
}
