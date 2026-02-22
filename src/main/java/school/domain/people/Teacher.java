package school.domain.people;

import lombok.Getter;
import lombok.Setter;
import school.domain.academics.Course;
import school.domain.interfaces.Teachable;
import school.domain.academics.SchoolClass;

import java.util.List;
import java.util.ArrayList;

@Setter
@Getter
public class Teacher extends Staff implements Teachable {
  List<Course> courses = new ArrayList<>();

  public Teacher(int id, String name, int age, double salary) {
    super(id, name, age, salary);
  }

  @Override
  public void teach(Course course, SchoolClass schoolClass) {
    System.out.println(getName() + " is teaching " + course.getTitle() + " to class " + schoolClass.getName());
  }

  public void addCourse(Course course) {
    if (!courses.contains(course)) {
      courses.add(course);
      System.out.println("Course " + course.getTitle() + " assigned to teacher " + getName());
    } else {
      System.out.println(getName() + " is already assigned to " + course.getTitle());
    }
  }
}
