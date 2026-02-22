package school.ui;

import school.domain.davina.Department;
import school.domain.academics.SchoolClass;
import school.service.course.impl.AddCourseServiceImpl;
import school.service.course.impl.CoursesListServiceImpl;
import school.service.student.impl.StudentsListServiceImpl;
import school.service.admission.impl.ExpelStudentServiceImpl;
import school.service.admission.impl.AdmitApplicantServiceImpl;
import school.service.course.impl.CourseTeacherAssignmentServiceImpl;
import school.service.course.impl.StudentCourseEnrollmentServiceImpl;

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
//          Student admission
          AdmitApplicantServiceImpl admitApplicantService = new AdmitApplicantServiceImpl();
          admitApplicantService.admitStudentApplicant(department, defaultClass, scanner);
          break;
        case "2":
//          Department students list
          StudentsListServiceImpl studentsListService = new StudentsListServiceImpl();
          studentsListService.listStudents(department);
          break;
        case "3":
//          Enroll student in a course
          StudentCourseEnrollmentServiceImpl studentCourseEnrollmentService = new StudentCourseEnrollmentServiceImpl();
          studentCourseEnrollmentService.enrollStudentInCourse(department, scanner);
          break;
        case "4":
//          List all courses
          CoursesListServiceImpl coursesListService = new CoursesListServiceImpl();
          coursesListService.listCourses(department);
          break;
        case "5":
//          Student expulsion
          ExpelStudentServiceImpl expelStudentService = new ExpelStudentServiceImpl();
          expelStudentService.expelStudent(department, scanner);
          break;
        case "6":
//          Add a course
          AddCourseServiceImpl addCourseService = new AddCourseServiceImpl();
          addCourseService.addCourse(department, scanner);
          break;
        case "7":
//          Assign course teacher
          CourseTeacherAssignmentServiceImpl courseTeacherAssignmentService = new CourseTeacherAssignmentServiceImpl();
          courseTeacherAssignmentService.assignTeacherToCourse(department, scanner, defaultClass);
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
