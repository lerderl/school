package school.service.admission.impl;

import school.domain.people.Student;
import school.domain.davina.Department;
import school.domain.academics.SchoolClass;
import school.domain.people.StudentApplicant;
import school.service.admission.AdmitApplicantService;

import java.util.Scanner;

public class AdmitApplicantServiceImpl implements AdmitApplicantService {
  @Override
  public void admitStudentApplicant(Department department, SchoolClass defaultClass, Scanner scanner) {
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
