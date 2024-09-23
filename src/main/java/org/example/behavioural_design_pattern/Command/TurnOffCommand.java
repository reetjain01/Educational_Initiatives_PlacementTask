package org.example.behavioural_design_pattern.Command;

public class TurnOffCommand implements Command {
    private final Light light; // Reference to the Light object.

    // Constructor to set the light object.
    public TurnOffCommand(Light light) {
        this.light = light;
    }

    // Executes the command to turn off the light.
    @Override
    public void execute() {
        if (light.isOn()) { // Check if the light is on.
            light.turnOff(); // If on, turn it off.
        } else {
            System.out.println("Light is already OFF"); // Otherwise, print a message.
        }
    }
}
