package org.example.Exercise_1.structural_design_pattern.Decorator;

// Simple implementation of the Coffee interface
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
