package org.example.Exercise_2.VirtualClassroomManager.util;


public class InputValidator {

    public static boolean validateArgs(String[] args, int expectedLength) {
        if (args.length < expectedLength) {
            System.out.println("Invalid number of arguments.");
            return false;
        }
        return true;
    }
}

