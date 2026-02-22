package school.domain.academics;

import lombok.Getter;
import lombok.Setter;
import school.domain.people.Student;
import school.domain.people.Teacher;

import java.util.List;
import java.util.ArrayList;

@Setter
@Getter
public class SchoolClass {
  String name;
  Teacher classTeacher;
  List<Student> students = new ArrayList<>();

  public SchoolClass(String name, Teacher classTeacher) {
    this.name = name;
    this.classTeacher = classTeacher;
  }

  public void addStudent(Student student) {
    if (students.contains(student)) {
      System.out.println(student.getName() + " is already in class " + name);
      return;
    }
    students.add(student);
    System.out.println(student.getName() + " added to class " + name);
  }
}
