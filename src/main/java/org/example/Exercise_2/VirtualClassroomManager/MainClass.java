package org.example.Exercise_2.VirtualClassroomManager;

import org.example.Exercise_2.VirtualClassroomManager.Models.Classroom;
import org.example.Exercise_2.VirtualClassroomManager.Models.Student;
import org.example.Exercise_2.VirtualClassroomManager.util.InputValidator;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ClassroomManager classroomManager = new ClassroomManager();
        StudentManager studentManager = new StudentManager();
        AssignmentManager assignmentManager = new AssignmentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            String[] command = input.split(" ");

            switch (command[0]) {
                case "add_classroom":
                    if (!InputValidator.validateArgs(command, 2)) break;
                    classroomManager.addClassroom(command[1]);
                    break;

                case "delete_classroom":
                    if (!InputValidator.validateArgs(command, 2)) break;
                    classroomManager.deleteClassroom(command[1]);
                    break;

                case "edit_classroom":
                    if (!InputValidator.validateArgs(command, 3)) break;
                    classroomManager.editClassroom(command[1], command[2]);
                    break;

                case "list_classrooms":
                    classroomManager.listClassrooms();
                    break;

                case "add_student":
                    if (!InputValidator.validateArgs(command, 3)) break;
                    Classroom classroom = classroomManager.getClassroom(command[2]);
                    if (classroom != null) {
                        studentManager.addStudent(classroom, command[1]);
                    } else {
                        System.out.println("Classroom " + command[2] + " not found.");
                    }
                    break;

                case "list_students":
                    if (!InputValidator.validateArgs(command, 2)) break;
                    Classroom classroomToList = classroomManager.getClassroom(command[1]);
                    if (classroomToList != null) {
                        studentManager.listStudents(classroomToList);
                    } else {
                        System.out.println("Classroom " + command[1] + " not found.");
                    }
                    break;

                case "list_assignments":
                    if (!InputValidator.validateArgs(command, 2)) break;
                    Classroom classroomForAssignments = classroomManager.getClassroom(command[1]);
                    if (classroomForAssignments != null) {
                        assignmentManager.listAssignments(classroomForAssignments);
                    } else {
                        System.out.println("Classroom " + command[1] + " not found.");
                    }
                    break;

                case "schedule_assignment":
                    if (!InputValidator.validateArgs(command, 3)) break;
                    Classroom classForAssignment = classroomManager.getClassroom(command[1]);
                    if (classForAssignment != null) {
                        assignmentManager.scheduleAssignment(classForAssignment, command[2]);
                    } else {
                        System.out.println("Classroom " + command[1] + " not found.");
                    }
                    break;

                case "submit_assignment":
                    if (!InputValidator.validateArgs(command, 4)) break;
                    Classroom classForSubmission = classroomManager.getClassroom(command[2]);
                    if (classForSubmission != null) {
                        Student student = classForSubmission.getStudent(command[1]);
                        if (student != null) {
                            assignmentManager.submitAssignment(classForSubmission, student, command[3]);
                        } else {
                            System.out.println("Student " + command[1] + " not found in classroom " + command[2]);
                        }
                    } else {
                        System.out.println("Classroom " + command[2] + " not found.");
                    }
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Unknown command. Try again.");
                    break;
            }
        }
    }
}
