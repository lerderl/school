package school.domain.people;

import school.domain.academics.Course;
import school.domain.interfaces.Enrollable;

import java.util.List;
import java.util.ArrayList;

public class Student extends Person implements Enrollable {
  List<Course> enrolledCourses = new ArrayList<>();

  public Student(int id, String name, int age) {
    super(id, name, age);
  }

  public List<Course> getEnrolledCourses() {
    return enrolledCourses;
  }

  public void setEnrolledCourses(List<Course> enrolledCourses) {
    this.enrolledCourses = enrolledCourses;
  }

  @Override
  public void enroll(Course course) {
//    Prevent duplicate enrollment
    if (enrolledCourses.contains(course)) {
      System.out.println(getName() + " is already enrolled in " + course.getTitle());
    }
    enrolledCourses.add(course);
    System.out.println(getName() + " enrolled in " + course.getTitle());
  }
}
