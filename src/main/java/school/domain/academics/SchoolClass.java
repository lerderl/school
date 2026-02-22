package school.domain.academics;

import school.domain.people.Student;
import school.domain.people.Teacher;

import java.util.List;
import java.util.ArrayList;

public class SchoolClass {
  String name;
  Teacher classTeacher;
  List<Student> students = new ArrayList<>();

  public SchoolClass(String name, Teacher classTeacher) {
    this.name = name;
    this.classTeacher = classTeacher;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teacher getClassTeacher() {
    return classTeacher;
  }

  public void setClassTeacher(Teacher classTeacher) {
    this.classTeacher = classTeacher;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
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
