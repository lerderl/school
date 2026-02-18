package school;

import school.davina.Department;
import school.academics.SchoolClass;

import java.util.Scanner;

public class RunConsole {
  public static void runConsole(Department department, SchoolClass defaultClass) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
//      Method to display the console menu
      ConsoleMenu.menu();
      String choice = scanner.nextLine().trim();

      switch (choice) {
        case "1":
//          Method to admit students
          AdmitApplicant.admitStudentApplicant(department, defaultClass, scanner);
          break;
        case "2":
//          Method to list students in the department
          StudentsList.listStudents(department);
          break;
        case "3":
//          Method to enroll student in a course
          StudentCourseEnrollment.enrollStudentInCourse(department, scanner);
          break;
        case "4":
//          Method to list all courses
          CoursesList.listCourses(department);
          break;
        case "5":
//          Method to expel a student
          ExpelStudent.expelStudent(department, scanner);
          break;
        case "6":
//          Method to add a course
          AddCourse.addCourse(department, scanner);
          break;
        case "7":
//          Method to assign course teacher
          CourseTeacherAssignment.assignTeacherToCourse(department, scanner, defaultClass);
          break;
        case "8":
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
}
