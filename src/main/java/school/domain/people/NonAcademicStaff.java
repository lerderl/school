package school.domain.people;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NonAcademicStaff extends Staff {
  String role;

  public NonAcademicStaff(int id, String name, int age, double salary, String role) {
    super(id, name, age, salary);
    this.role = role;
  }

}
