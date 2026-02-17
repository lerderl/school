package school.interfaces;

import school.academics.Course;
import school.academics.SchoolClass;

public interface Teachable {
  void teach(Course course, SchoolClass schoolClass);
}
