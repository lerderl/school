package school.people;

public class Staff extends Person {
  double salary;

  public Staff(int id, String name, int age, double salary) {
    super(id, name, age);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
