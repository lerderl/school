package school.service.course;

import school.domain.davina.Department;

public class CoursesListService {
  public static void listCourses(Department department) {
    if (department.getCourses().isEmpty()) {
      System.out.println("No courses in the department");
      return;
    }

    System.out.println("Courses in " + department.getName() + ":");
    department.getCourses().forEach(System.out::println);
  }
}
