package org.example.Exercise_1.behavioural_design_pattern.Command;

public class TurnOnCommand implements Command {
    private final Light light; // Reference to the Light object.

    // Constructor to initialize the light object.
    public TurnOnCommand(Light light) {
        this.light = light;
    }

    // Executes the command to turn on the light.
    @Override
    public void execute() {
        if (!light.isOn()) { // Check if the light is off.
            light.turnOn(); // If off, turn it on.
        } else {
            System.out.println("Light is already ON"); // Otherwise, print a message.
        }
    }
}
