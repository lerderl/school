package school.service.admission.impl;

import school.domain.people.Student;
import school.domain.davina.Department;
import school.service.admission.ExpelStudentService;

import java.util.Scanner;

public class ExpelStudentServiceImpl implements ExpelStudentService {
  @Override
  public void expelStudent(Department department, Scanner scanner) {
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
