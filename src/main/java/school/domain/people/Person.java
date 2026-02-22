package school.domain.people;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Person {
  int id;
  String name;
  int age;

  public Person(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

}
