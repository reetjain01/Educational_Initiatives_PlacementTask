package org.example.Exercise_2.VirtualClassroomManager.Models;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(String studentId) {
        return students.stream().filter(s -> s.getStudentId().equals(studentId)).findFirst().orElse(null);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        this.assignments.add(assignment);
    }

    public boolean hasStudent(String studentId) {
        return getStudent(studentId) != null;
    }

    // Get all assignments for the classroom
    public List<Assignment> getAssignments() {
        return assignments;
    }
}
