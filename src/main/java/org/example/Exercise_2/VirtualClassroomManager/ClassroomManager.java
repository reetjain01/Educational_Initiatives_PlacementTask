package org.example.Exercise_2.VirtualClassroomManager;

import org.example.Exercise_2.VirtualClassroomManager.Models.Classroom;


import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    private Map<String, Classroom> classrooms;

    public ClassroomManager() {
        this.classrooms = new HashMap<>();
    }

    // Add a new classroom
    public void addClassroom(String className) {
        if (classrooms.containsKey(className)) {
            System.out.println("Classroom " + className + " already exists.");
            return;
        }
        classrooms.put(className, new Classroom(className));
        System.out.println("Classroom " + className + " has been created.");
    }

    // Delete a classroom
    public void deleteClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            System.out.println("Classroom " + className + " not found.");
            return;
        }
        classrooms.remove(className);
        System.out.println("Classroom " + className + " has been deleted.");
    }

    // Edit a classroom name
    public void editClassroom(String oldClassName, String newClassName) {
        if (!classrooms.containsKey(oldClassName)) {
            System.out.println("Classroom " + oldClassName + " not found.");
            return;
        }
        if (classrooms.containsKey(newClassName)) {
            System.out.println("Classroom " + newClassName + " already exists.");
            return;
        }
        Classroom classroom = classrooms.remove(oldClassName);
        classroom.setClassName(newClassName);
        classrooms.put(newClassName, classroom);
        System.out.println("Classroom " + oldClassName + " has been renamed to " + newClassName);
    }

    // List all available classrooms
    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        System.out.println("Available Classrooms:");
        for (String className : classrooms.keySet()) {
            System.out.println("- " + className);
        }
    }

    // Get a classroom by name
    public Classroom getClassroom(String className) {
        return classrooms.get(className);
    }
}
