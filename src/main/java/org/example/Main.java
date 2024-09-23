package org.example;

import org.example.behavioural_design_pattern.Command.*;
import org.example.behavioural_design_pattern.Observer.DisplayScreen;
import org.example.behavioural_design_pattern.Observer.WeatherStation;
import org.example.creational_design_pattern.Builder.Computer;
import org.example.creational_design_pattern.Builder.ComputerBuilder;
import org.example.creational_design_pattern.Builder.ComputerDirector;
import org.example.creational_design_pattern.Factory.Shape;
import org.example.creational_design_pattern.Factory.ShapeFactory;
import org.example.structural_design_pattern.Adapter.AudioPlayer;
import org.example.structural_design_pattern.Decorator.*;

public class Main {
    public static void main(String[] args) {

        //  BEHAVIOURAL PATTERN
        // 1. Testing Command Pattern
//        System.out.println("===== Command Pattern =====");
//        Light light = new Light();
//        Command turnOn = new TurnOnCommand(light);
//        Command turnOff = new TurnOffCommand(light);
//
//        RemoteControl remote = new RemoteControl();
//        remote.setCommand(turnOn);
//        remote.pressButton();  // Output: The light is ON
//        remote.setCommand(turnOn);
//        remote.pressButton();  // Output: Light is already ON
//        remote.setCommand(turnOff);
//        remote.pressButton();  // Output: The light is OFF
//        remote.setCommand(turnOff);
//        remote.pressButton(); // Output: light is already OFF


        // 2. Testing Observer Pattern
        //  System.out.println("===== Observer Pattern =====");

        // Create WeatherStation (Subject)
//        WeatherStation weatherStation = new WeatherStation();
//
//        // Create DisplayScreen observers
//        DisplayScreen screen1 = new DisplayScreen("Display Screen 1");
//        DisplayScreen screen2 = new DisplayScreen("Display Screen 2");
//        DisplayScreen screen3 = new DisplayScreen("Display Screen 3");
//
//        // Add observers to the WeatherStation
//        weatherStation.addObserver(screen1);
//        weatherStation.addObserver(screen2);
//        weatherStation.addObserver(screen3);
//
//        // Simulate temperature changes
//        weatherStation.setTemperature(25.0f);
//        weatherStation.setTemperature(30.5f);
//        weatherStation.setTemperature(28.8f);
//
//        // Remove one observer and update temperature again
//        weatherStation.removeObserver(screen2);
//        weatherStation.setTemperature(26.4f);



        //  CREATIONAL PATTERN
        // 1. Testing Factory Pattern
        //  System.out.println("===== Factory Pattern =====");

        // Create factory object
//        ShapeFactory factory = new ShapeFactory();
//
//        // Get and draw a Circle
//        Shape circle = factory.getShape("CIRCLE");
//        circle.draw();
//
//        // Get and draw a Square
//        Shape square = factory.getShape("SQUARE");
//        square.draw();


        // 2. Testing Builder Pattern
        //  System.out.println("===== Builder Pattern =====");

//        // Step 1: Create a builder object for the required parameters
//        ComputerBuilder builder = new ComputerBuilder("Intel i7", "16GB");
//
//        // Step 2: Use the director to construct specific types of computers
//        ComputerDirector director = new ComputerDirector(builder);
//
//        // Build a gaming computer
//        Computer gamingComputer = director.buildGamingComputer();
//        gamingComputer.showSpecs();  // Display specs of the gaming computer
//
//        // Build an office computer
//        Computer officeComputer = director.buildOfficeComputer();
//        officeComputer.showSpecs();  // Display specs of the office computer



        //  STRUCTURAL PATTERN
        // 1. Testing Adapter Pattern
        //  System.out.println("===== Adapter Pattern =====");
//            // Create an AudioPlayer instance
//            AudioPlayer audioPlayer = new AudioPlayer();
//
//            // Playing MP3 file
//            audioPlayer.play("mp3", "song.mp3");
//
//            // Playing MP4 file using adapter
//            audioPlayer.play("mp4", "movie.mp4");
//
//            // Attempting to play an unsupported format
//            audioPlayer.play("avi", "movie.avi");




        // 2. Testing Decorator Pattern
        //  System.out.println("===== Decorator Pattern =====");
        // Start with a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " Cost: $" + coffee.getCost());

        // Add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: $" + coffee.getCost());

        // Add sugar to the coffee
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: $" + coffee.getCost());

        // Add whipped cream to the coffee
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: $" + coffee.getCost());
    }
}