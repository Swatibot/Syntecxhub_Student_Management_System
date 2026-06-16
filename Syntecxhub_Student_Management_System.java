import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
        System.out.println("--------------------------------");
    }
}

public class Syntecxhub_Student_Management_System {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Preloaded Student Records
        students.add(new Student(101, "Ashirbada Behera", 20, "Java"));
        students.add(new Student(102, "Swatishree Padhiary", 20, "Python"));
        students.add(new Student(103, "Rahul Sharma", 21, "Data Analytics"));
        students.add(new Student(104, "Priya Singh", 19, "Machine Learning"));
        students.add(new Student(105, "Aman Verma", 22, "Web Development"));
        students.add(new Student(106, "Sneha Das", 20, "Cyber Security"));
        students.add(new Student(107, "Rohan Patel", 21, "Cloud Computing"));
        students.add(new Student(108, "Anjali Gupta", 19, "Artificial Intelligence"));
        students.add(new Student(109, "Vikash Kumar", 22, "Software Testing"));
        students.add(new Student(110, "Neha Mishra", 20, "Full Stack Development"));

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(id, name, age, course));

        System.out.println("Student Added Successfully!");
    }

    static void viewStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    static void updateStudent() {
        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.id == id) {

                System.out.print("New Name: ");
                s.name = sc.nextLine();

                System.out.print("New Age: ");
                s.age = sc.nextInt();
                sc.nextLine();

                System.out.print("New Course: ");
                s.course = sc.nextLine();

                System.out.println("Student Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    static void deleteStudent() {
        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }
}