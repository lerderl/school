package school.ui;

import school.domain.people.Teacher;
import school.domain.davina.Department;
import school.domain.academics.SchoolClass;
import school.service.admission.AdmitApplicantService;
import school.service.admission.ExpelStudentService;
import school.service.course.AddCourseService;
import school.service.course.CourseTeacherAssignmentService;
import school.service.course.CoursesListService;
import school.service.course.StudentCourseEnrollmentService;
import school.service.student.StudentsListService;

import java.util.Scanner;

public class RunConsole {
  public static void runConsole(Department department, SchoolClass defaultClass, Teacher teacher) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
//      Method to display the console menu
      ConsoleMenu.menu();
      String choice = scanner.nextLine().trim();

      switch (choice) {
        case "1":
//          Method to admit students
          AdmitApplicantService.admitStudentApplicant(department, defaultClass, scanner);
          break;
        case "2":
//          Method to list students in the department
          StudentsListService.listStudents(department);
          break;
        case "3":
//          Method to enroll student in a course
          StudentCourseEnrollmentService.enrollStudentInCourse(department, scanner);
          break;
        case "4":
//          Method to list all courses
          CoursesListService.listCourses(department);
          break;
        case "5":
//          Method to expel a student
          ExpelStudentService.expelStudent(department, scanner);
          break;
        case "6":
//          Method to add a course
          AddCourseService.addCourse(department, scanner);
          break;
        case "7":
//          Method to assign course teacher
          CourseTeacherAssignmentService.assignTeacherToCourse(department, scanner, defaultClass, teacher);
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
