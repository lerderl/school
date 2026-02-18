package school;

import school.davina.Department;

public class CoursesList {
  public static void listCourses(Department department) {
    if (department.getCourses().isEmpty()) {
      System.out.println("No courses in the department");
      return;
    }

    System.out.println("Courses in " + department.getName() + ":");
    department.getCourses().forEach(System.out::println);
  }
}
