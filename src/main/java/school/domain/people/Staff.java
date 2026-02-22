package school.domain.people;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Staff extends Person {
  double salary;

  public Staff(int id, String name, int age, double salary) {
    super(id, name, age);
    this.salary = salary;
  }

}
