package school.service.course.impl;

import school.domain.davina.Department;
import school.service.course.CoursesListService;

public class CoursesListServiceImpl implements CoursesListService {
  @Override
  public void listCourses(Department department) {
    if (department.getCourses().isEmpty()) {
      System.out.println("No courses in the department");
      return;
    }

    System.out.println("Courses in " + department.getName() + ":");
    department.getCourses().forEach(System.out::println);
  }
}
