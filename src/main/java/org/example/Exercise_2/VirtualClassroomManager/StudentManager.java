package org.example.Exercise_2.VirtualClassroomManager;

import org.example.Exercise_2.VirtualClassroomManager.Models.Classroom;
import org.example.Exercise_2.VirtualClassroomManager.Models.Student;


public class StudentManager {

    // Add a student to a classroom
    public void addStudent(Classroom classroom, String studentId) {
        if (classroom.getStudent(studentId) != null) {
            System.out.println("Student " + studentId + " already enrolled in " + classroom.getClassName());
            return;
        }
        classroom.addStudent(new Student(studentId));
        System.out.println("Student " + studentId + " has been enrolled in " + classroom.getClassName());
    }

    // List all students in a classroom
    public void listStudents(Classroom classroom) {
        System.out.println("Students in " + classroom.getClassName() + ":");
        if (classroom.getStudents().isEmpty()) {
            System.out.println("No students enrolled yet.");
        } else {
            for (Student student : classroom.getStudents()) {
                System.out.println("- " + student.getStudentId());
            }
        }
    }
}

