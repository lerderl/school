package school.people;

public class StudentApplicant extends Person {
  public StudentApplicant(String id, String name, int age) {
    super(Integer.parseInt(id), name, age);
  }
}
