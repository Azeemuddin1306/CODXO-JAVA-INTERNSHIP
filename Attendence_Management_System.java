import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String name;
    private boolean isPresent;

    public Student(String name) {
        this.name = name;
        this.isPresent = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void markPresent() {
        this.isPresent = true;
    }

    public void markAbsent() {
        this.isPresent = false;
    }
}

class AttendanceSystem {
    private Map<Integer, Student> students;

    public AttendanceSystem() {
        students = new HashMap<>();
    }

    public void addStudent(int id, String name) {
        students.put(id, new Student(name));
    }

    public void markAttendance(int id, boolean isPresent) {
        Student student = students.get(id);
        if (student != null) {
            if (isPresent) {
                student.markPresent();
            } else {
                student.markAbsent();
            }
        } else {
            System.out.println("Student not found!");
        }
    }

    public void displayAttendance() {
        System.out.println("Attendance Records:");
        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            Student student = entry.getValue();
            System.out.println("ID: " + entry.getKey() + ", Name: " + student.getName() + ", Present: " + student.isPresent());
        }
    }
}

public class AttendanceManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceSystem attendanceSystem = new AttendanceSystem();

        while (true) {
	    System.out.println("\t   ABC COLLEGE OF ENGINEERING AND TECHNOLOGY");
            System.out.println("\n1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Display Attendance");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    attendanceSystem.addStudent(id, name);
                    break;
                case 2:
                    System.out.print("\nEnter student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter 1 for present, 0 for absent: ");
                    int attendance = scanner.nextInt();
                    attendanceSystem.markAttendance(studentId, attendance == 1);
                    break;
                case 3:
                    attendanceSystem.displayAttendance();
                    break;
                case 4:
                    System.out.println("\nExiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}