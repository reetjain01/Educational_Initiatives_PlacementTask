package org.example.Exercise_2.VirtualClassroomManager.util;


public class Logger {

    public static void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public static void error(String message) {
        System.err.println("[ERROR] " + message);
    }
}
