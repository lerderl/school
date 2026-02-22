package school.service.student;

import school.domain.davina.Department;

public class StudentsListService {
  public static void listStudents(Department department) {
    if (department.getStudents().isEmpty()) {
      System.out.println("No students in the department.");
      return;
    }
    System.out.println("Students in " + department.getName() + ":");
    department.getStudents().forEach(student -> System.out.println("ID: " + student.getId() +
        ", Name: " + student.getName() + ", Age: " + student.getAge() + " years old"));
  }
}
