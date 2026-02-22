package school;

import school.people.Student;
import school.davina.Department;
import school.academics.SchoolClass;
import school.people.StudentApplicant;

import java.util.Scanner;

public class AdmitApplicant {
  public static void admitStudentApplicant(Department department, SchoolClass defaultClass, Scanner scanner) {
    int id = (int) ((Math.random() * 9000) + 1000);
    System.out.println("Student ID: " + id);

    System.out.print("Enter applicant name: ");
    String name = scanner.nextLine().trim();

    System.out.print("Enter applicant age: ");
    String ageInput = scanner.nextLine().trim();
    int age;

    try {
      age = Integer.parseInt(ageInput);
    } catch (NumberFormatException e) {
      System.out.println("Invalid age. Admission cancelled.");
      return;
    }

    StudentApplicant applicant = new StudentApplicant(id, name, age);
    Student student = department.getPrincipal().admit(applicant);

    if (student != null) {
      department.addStudent(student);
//      Add to default class for simplicity
      defaultClass.addStudent(student);
      System.out.println(student.getName() + " admitted and added to class " + defaultClass.getName());
    } else {
      System.out.println("Admission failed.");
    }
  }
}
