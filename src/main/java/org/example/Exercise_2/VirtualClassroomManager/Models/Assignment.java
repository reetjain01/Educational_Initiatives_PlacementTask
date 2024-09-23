package org.example.Exercise_2.VirtualClassroomManager.Models;


public class Assignment {
    private String assignmentDetails;

    public Assignment(String assignmentDetails) {
        this.assignmentDetails = assignmentDetails;
    }

    public String getAssignmentDetails() {
        return assignmentDetails;
    }

    // Get the details of the assignment
    public String getDetails() {
        return assignmentDetails;
    }
}
