package school.service.course;

import school.domain.academics.Course;
import school.domain.davina.Department;

import java.util.Scanner;

public class AddCourseService {
  public static void addCourse(Department department, Scanner scanner) {
    System.out.print("Enter course code: ");
    String code = scanner.nextLine().trim();

    if (department.findCourseByCode(code) != null) {
      System.out.println("A course with this code already exists");
      return;
    }

    System.out.print("Enter course title: ");
    String title = scanner.nextLine().trim();

    System.out.print("Enter course units: ");
    String unitsInput = scanner.nextLine().trim();
    int units;

    try {
      units = Integer.parseInt(unitsInput);
    } catch (NumberFormatException e) {
      System.out.println("Invalid units. Operation cancelled.");
      return;
    }

    Course course = new Course(code, title, units);
    department.addCourse(course);
    System.out.println("Course added: " + course);
  }
}
