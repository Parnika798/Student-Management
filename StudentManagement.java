import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void addStudent() {
        try {
            System.out.print("Enter PRN: ");
            String prn = scanner.next();
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter DOB (dd/MM/yyyy): ");
            String dobStr = scanner.next();
            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();

            students.add(new Student(prn, name, sdf.parse(dobStr), marks));
            System.out.println("Student added successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input. Try again.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    public void searchByPRN() {
        System.out.print("Enter PRN to search: ");
        String prn = scanner.next();
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.next();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.display();
            }
        }
    }

    public void searchByPosition() {
        System.out.print("Enter position (index): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < students.size()) {
            students.get(index).display();
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void updateStudent() {
        System.out.print("Enter PRN to update: ");
        String prn = scanner.next();
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                System.out.print("Enter new Marks: ");
                double marks = scanner.nextDouble();
                s.setMarks(marks);
                System.out.println("Updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        String prn = scanner.next();
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                students.remove(s);
                System.out.println("Deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
