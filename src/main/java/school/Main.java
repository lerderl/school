package school;

import school.people.Student;
import school.people.Teacher;
import school.people.Principal;
import school.davina.Department;
import school.academics.SchoolClass;
import school.people.StudentApplicant;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
//    Demo data
    Principal principal = new Principal(1, "Patrick Okebu", 38, 3000000, 12);
    Department department = new Department("Science", principal);

    Teacher teacher = new Teacher(1, "Sonia Atuchukwu", 30, 150000);

    SchoolClass sss1 = new SchoolClass("SS1A", teacher);
    department.addClass(sss1);

    runConsole(department, sss1);
  }

  public static void runConsole(Department department, SchoolClass defaultClass) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
      menu();
      String choice = scanner.nextLine().trim();

      switch (choice) {
        case "1":
          admitStudentApplicant(department, defaultClass, scanner);
          break;
        case "2":
          listStudents(department);
          break;
        case "5":
          expelStudent(department, scanner);
          break;
        case "6":
          running = false;
          System.out.println("Exiting the application....");
          break;
        default:
          System.out.println("Invalid choice. Please choose a valid option.");
      }
      System.out.println();
    }
    scanner.close();
  }

//  Method to display the console menu
  public static void menu() {
    System.out.println("===== SCHOOL MANAGEMENT MENU =====");
    System.out.println("1. Admit Applicant");
    System.out.println("2. List Students");
    System.out.println("3. Enroll Student in Course");
    System.out.println("4. List Courses");
    System.out.println("5. Expel Student");
    System.out.println("6. Exit");
    System.out.print("Select an option: ");
  }

//  Method to admit students
  public static void admitStudentApplicant(Department department, SchoolClass defaultClass, Scanner scanner) {
    int id = (int) ((Math.random() * 9000) + 1000);
    System.out.println("Student ID: " + id);

    System.out.print("Enter applicant name: ");
    String name = scanner.nextLine().trim();

    System.out.print("Enter applicant age: ");
    String ageInput = scanner.nextLine().trim();
    int age;

    try {
      age = Integer.parseInt(ageInput);
    } catch (NumberFormatException e) {
      System.out.println("Invalid age. Admission cancelled.");
      return;
    }

    StudentApplicant applicant = new StudentApplicant(id, name, age);
    Student student = department.getPrincipal().admit(applicant);

    if (student != null) {
      department.addStudent(student);
//      Add to default class for simplicity
      defaultClass.addStudent(student);
      System.out.println(student.getName() + " admitted and added to class " + defaultClass.getName());
    } else {
      System.out.println("Admission failed.");
    }
  }

//  Method to list students in the department
  public static void listStudents(Department department) {
    if (department.getStudents().isEmpty()) {
      System.out.println("No students in the department.");
      return;
    }
    System.out.println("Students in " + department.getName() + ":");
    department.getStudents().forEach(student -> System.out.println("ID: " + student.getId() +
        ", Name: " + student.getName() + ", Age: " + student.getAge() + " years old"));
  }

//  Method to expel a student
  public static void expelStudent(Department department, Scanner scanner) {
    if (department.getStudents().isEmpty()) {
      System.out.println("No students to expel");
      return;
    }

    System.out.print("Enter student name to expel: ");
    String studentName = scanner.nextLine().trim();
    Student student = department.findStudentByName(studentName);
    if (student == null) {
      System.out.println("Student not found");
      return;
    }

    department.getPrincipal().expel(student, department);
  }
}
