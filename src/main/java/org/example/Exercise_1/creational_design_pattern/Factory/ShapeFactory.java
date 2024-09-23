package org.example.Exercise_1.creational_design_pattern.Factory;

// Factory class to generate Shape objects based on input
public class ShapeFactory {
    // Returns a Shape based on the type passed
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

