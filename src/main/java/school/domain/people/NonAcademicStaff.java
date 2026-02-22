package school.domain.people;

public class NonAcademicStaff extends Staff {
  String role;

  public NonAcademicStaff(int id, String name, int age, double salary, String role) {
    super(id, name, age, salary);
    this.role = role;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
