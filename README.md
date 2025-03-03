Project Description
This project is a menu-driven Java application that helps manage student records.
It demonstrates key Object-Oriented Programming (OOP) concepts such as classes, objects, constructors, instance members, and arrays of objects (ArrayList).


The program allows users to:

Add a Student

Display all Students

Search for a Student (by PRN, Name, or Position)

Update Student Details

Delete a Student



Project Structure


The project consists of multiple Java files, each handling a specific responsibility:

Student.java - Defines the Student class with attributes and methods.

StudentManagement.java - Contains all student operations (Add, Display, Search, Update, Delete).

Main.java - Implements a menu-driven system to interact with users.



Features & Functions
1. Student.java (Defines Student Attributes)
   
Student(String prn, String name, Date dob, double marks): Constructor to initialize student details.

getPrn(), getName(), getDob(), getMarks(): Getter methods for retrieving details.

setMarks(double marks): Updates student marks.

display(): Prints student details.

2. StudentManagement.java (Handles All Operations)
   
addStudent(): Adds a new student by taking input from the user.

displayStudents(): Displays the list of all students.

searchByPRN(): Searches a student by PRN.

searchByName(): Searches students by Name.

searchByPosition(): Searches a student by ArrayList index.

updateStudent(): Updates student marks by PRN.

deleteStudent(): Deletes a student by PRN.

3. Main.java (User Interface)
   
Implements a menu-driven system with a loop.

Allows users to select an operation via keyboard input.

Calls corresponding functions from StudentManagement.java.

Uses switch-case to handle menu choices.
