import java.util.ArrayList;
import java.util.Scanner;

abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayInfo();
}

class Student1 extends Person {
    private int rollNumber;
    private String course;

    public Student1(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }

    public void displayInfo() {
        System.out.println(name + " " + age + " " + rollNumber + " " + course);
    }
}

class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println(name + " " + age + " " + subject + " " + salary);
    }
}

class GraduteStudent extends Student1 {
    private String researchTopic;

    public GraduteStudent(String name, int age, int rollNumber, String course, String researchTopic) {
        super(name, age, rollNumber, course);
        this.researchTopic = researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    void dispplayInfo() {
        System.out.println(getResearchTopic());
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student1> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayAllStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        Student1 student = new Student1(name, age, rollNumber, course);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student1 student : students) {
            student.displayInfo();
        }
    }

    private static void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int rollNumber = scanner.nextInt();
        for (Student1 student : students) {
            if (student.getRollNumber() == rollNumber) {
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void updateStudent() {
        System.out.print("Enter roll number to update: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Student1 student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.print("Enter new course: ");
                String newCourse = scanner.nextLine();
                student.setCourse(newCourse);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void deleteStudent() {
        System.out.print("Enter roll number to delete: ");
        int rollNumber = scanner.nextInt();

        students.removeIf(student -> student.getRollNumber() == rollNumber);
        System.out.println("Student removed successfully!");
    }
}
