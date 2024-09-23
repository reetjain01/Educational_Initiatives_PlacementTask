package org.example.Exercise_1.creational_design_pattern.Builder;


// Director class that guides the building process
public class ComputerDirector {
    private ComputerBuilder builder;

    // Constructor to assign the builder
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    // Method that directs the builder to create a high-end gaming PC
    public Computer buildGamingComputer() {
        return builder
                .setStorage("2TB SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();
    }

    // Method that directs the builder to create a basic office PC
    public Computer buildOfficeComputer() {
        return builder
                .setStorage("512GB SSD")
                .setGraphicsCard(false)
                .setBluetooth(false)
                .build();
    }
}
