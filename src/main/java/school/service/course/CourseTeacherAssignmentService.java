package school.service.course;

import school.domain.davina.Department;
import school.domain.academics.SchoolClass;

import java.util.Scanner;

public interface CourseTeacherAssignmentService {
  void addTeacher(Department department, Scanner scanner);
  void assignTeacherToCourse(Department department, Scanner scanner, SchoolClass defaultClass);
}
