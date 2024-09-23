package org.example.Exercise_2.VirtualClassroomManager;

import org.example.Exercise_2.VirtualClassroomManager.Models.Classroom;
import org.example.Exercise_2.VirtualClassroomManager.Models.Assignment;
import org.example.Exercise_2.VirtualClassroomManager.Models.Student;


public class AssignmentManager {

    // Schedule an assignment for a classroom
    public void scheduleAssignment(Classroom classroom, String assignmentDetails) {
        classroom.addAssignment(new Assignment(assignmentDetails));
        System.out.println("Assignment for " + classroom.getClassName() + " has been scheduled.");
    }

    // Submit an assignment for a student in a classroom
    public void submitAssignment(Classroom classroom, Student student, String assignmentDetails) {
        if (!classroom.hasStudent(student.getStudentId())) {
            System.out.println("Student " + student.getStudentId() + " is not enrolled in " + classroom.getClassName());
            return;
        }
        System.out.println("Assignment submitted by Student " + student.getStudentId() + " in " + classroom.getClassName());
    }

    // List all assignments for a specific classroom
    public void listAssignments(Classroom classroom) {
        System.out.println("Assignments for " + classroom.getClassName() + ":");
        if (classroom.getAssignments().isEmpty()) {
            System.out.println("No assignments scheduled yet.");
        } else {
            for (Assignment assignment : classroom.getAssignments()) {
                System.out.println("- " + assignment.getDetails());
            }
        }
    }
}
