package org.example.Exercise_1.behavioural_design_pattern.Command;

public class RemoteControl {
    private Command command; // Holds the command to be executed.

    // Sets the command to be executed when the button is pressed.
    public void setCommand(Command command) {
        this.command = command;
    }

    // Simulates pressing a button to execute the set command.
    public void pressButton() {
        command.execute();
    }
}
