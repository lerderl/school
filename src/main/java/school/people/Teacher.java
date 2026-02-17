package school.people;

import school.academics.Course;
import school.interfaces.Teachable;
import school.academics.SchoolClass;

import java.util.List;
import java.util.ArrayList;

public class Teacher extends Staff implements Teachable {
  List<Course> courses = new ArrayList<>();

  public Teacher(int id, String name, int age, double salary) {
    super(id, name, age, salary);
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }

  @Override
  public void teach(Course course, SchoolClass schoolClass) {
    System.out.println(getName() + " is teaching " + course.getTitle() + " to class " + schoolClass.getName());
  }

  public void addCourse(Course course) {
    if (!courses.contains(course)) {
      courses.add(course);
    }
  }
}
