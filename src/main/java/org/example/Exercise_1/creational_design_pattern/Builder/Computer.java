package org.example.Exercise_1.creational_design_pattern.Builder;

// The product class representing a computer
public class Computer {
    private String CPU;              // Required parameter
    private String RAM;              // Required parameter
    private String storage;          // Optional parameter
    private boolean hasGraphicsCard; // Optional parameter
    private boolean hasBluetooth;    // Optional parameter

    // Private constructor to ensure the only way to create the object is via the builder
    Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Method to display the computer's specifications
    public void showSpecs() {
        System.out.println("Computer Specifications:");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("Has Graphics Card: " + hasGraphicsCard);
        System.out.println("Has Bluetooth: " + hasBluetooth);
    }
}

