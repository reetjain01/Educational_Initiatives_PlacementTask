# Educational Initiatives - Placement Task

This repository contains solutions to two exercises designed to demonstrate the application of design patterns and backend management for an EdTech platform. The code is written in Java and follows best practices, including SOLID principles and design patterns.

## Table of Contents

1. [Exercise 1 - Design Patterns](#exercise-1---design-patterns)
   - [Behavioural Patterns](#behavioural-patterns)
   - [Creational Patterns](#creational-patterns)
   - [Structural Patterns](#structural-patterns)
2. [Exercise 2 - Virtual Classroom Manager](#exercise-2---virtual-classroom-manager)
   - [Functional Requirements](#functional-requirements)
   - [How to Run](#how-to-run)
   - [Code Walkthrough](#code-walkthrough)
3. [Evaluation Criteria](#evaluation-criteria)

## Exercise 1 - Design Patterns

This exercise involves demonstrating various design patterns categorized into behavioural, creational, and structural patterns.

### Behavioural Patterns

- **Command Pattern**: Used to encapsulate all information needed to perform an action or trigger an event at a later time.
- **Observer Pattern**: Used to maintain a one-to-many relationship between objects, where if one object changes state, all its dependents are notified automatically.

### Creational Patterns

- **Builder Pattern**: Provides a flexible solution to constructing complex objects by separating the construction and representation.
- **Factory Pattern**: Defines an interface for creating objects but allows subclasses to alter the type of objects that will be created.

### Structural Patterns

- **Adapter Pattern**: Allows incompatible interfaces to work together by providing a bridge between them.
- **Decorator Pattern**: Used to dynamically add new behaviour to objects without modifying their existing code, offering more flexibility than static inheritance.

---

## Exercise 2 - Virtual Classroom Manager

The second exercise involves developing a terminal-based Virtual Classroom Manager for an EdTech platform, where classrooms can be added, students enrolled, assignments scheduled, and submissions tracked.

### Functional Requirements

1. **Classroom Management**:

   - Add virtual classrooms.
   - List available classrooms.
   - Remove classrooms.
   - Edit classrooms name

2. **Student Management**:

   - Enroll students in specific classrooms.
   - List students enrolled in a classroom.

3. **Assignment Management**:
   - Schedule assignments for classrooms.
   - Allow students to submit assignments.
   - List all the assignment for a specific classrooms

### User Input Commands

1. **Add Classroom**:

   ```bash
   add_classroom [class_name]
   ```

   - Creates a new classroom.
   - Output: `Classroom [class_name] has been created.`

2. **Add Student**:

   ```bash
   add_student [student_id] [class_name]
   ```

   - Enrolls a student in the specified classroom.
   - Output: `Student [student_id] has been enrolled in [class_name].`

3. **Schedule Assignment**:

   ```bash
   schedule_assignment [class_name] [assignment_details]
   ```

   - Schedules an assignment for the specified classroom.
   - Output: `Assignment for [class_name] has been scheduled.`

4. **Submit Assignment**:
   ```bash
   submit_assignment [student_id] [class_name] [assignment_details]
   ```
   - Marks an assignment as submitted by a student.
   - Output: `Assignment submitted by Student [student_id] in [class_name].`

---

### How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/reetjain01/Educational_Initiatives_PlacementTask.git
   cd your_repo_name
   ```

2. Compile the Java code:

   ```bash
   javac MainClass.java
   ```

3. Run the application:

   ```bash
   java MainClass
   ```

4. Start interacting with the terminal-based system by following the user input commands listed above.

---

## Contact

If you have any questions, feel free to reach out to me at [jainreet112@gmail.com](mailto:jainreet112@gmail.com).

---
