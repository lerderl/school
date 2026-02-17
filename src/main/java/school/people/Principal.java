package school.people;

import school.davina.Department;

public class Principal extends Staff {
  int minimumAdmissionAge;

  public Principal(int id, String name, int age, double salary, int minimumAdmissionAge) {
    super(id, name, age, salary);
    this.minimumAdmissionAge = minimumAdmissionAge;
  }

  public int getMinimumAdmissionAge() {
    return minimumAdmissionAge;
  }

  public void setMinimumAdmissionAge(int minimumAdmissionAge) {
    this.minimumAdmissionAge = minimumAdmissionAge;
  }

//  Admit student applicant based on age
  public Student admit (StudentApplicant applicant) {
    if (applicant.getAge() >= minimumAdmissionAge) {
      System.out.println("Principal " + getName() + " admitted applicant " + applicant.getName());
      return new Student(
          applicant.getId(),
          applicant.getName(),
          applicant.getAge()
      );
    }
    System.out.println("Principal " + getName() + " rejected applicant " + applicant.getName() + " due to age less than 12.");
    return null;
  }

//  Expel student from department
  public void expel(Student student, Department department) {
    department.removeStudent(student);
    System.out.println("Principal " + getName() + " expelled " + student.getName());
  }
}
