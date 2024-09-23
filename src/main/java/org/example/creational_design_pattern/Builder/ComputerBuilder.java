package org.example.creational_design_pattern.Builder;

// Builder class used to construct the Computer object
public class ComputerBuilder {
    // Required parameters
    protected String CPU;
    protected String RAM;

    // Optional parameters
    protected String storage;
    protected boolean hasGraphicsCard;
    protected boolean hasBluetooth;

    // Constructor for setting required parameters
    public ComputerBuilder(String CPU, String RAM) {
        this.CPU = CPU;
        this.RAM = RAM;
    }

    // Setter method for optional storage attribute
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    // Setter method for optional graphics card attribute
    public ComputerBuilder setGraphicsCard(boolean hasGraphicsCard) {
        this.hasGraphicsCard = hasGraphicsCard;
        return this;
    }

    // Setter method for optional Bluetooth attribute
    public ComputerBuilder setBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
        return this;
    }

    // Final build method that constructs the Computer object
    public Computer build() {
        return new Computer(this);  // Create a Computer instance using this builder
    }
}

