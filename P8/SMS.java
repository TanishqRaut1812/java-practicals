import java.util.*;

class Student {
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class SMS {
    static Scanner sc = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int count = 0;

    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();

        students[count++] = new Student(roll, name, marks);
        System.out.println("Student Added Successfully!\n");
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("No students found!\n");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (students[i].rollNo == roll) {
                students[i].display();
                return;
            }
        }

        System.out.println("Student not found!\n");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: searchStudent(); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!\n");
            }
        } while (choice != 4);
    }
}