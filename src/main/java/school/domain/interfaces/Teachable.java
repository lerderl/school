package school.domain.interfaces;

import school.domain.academics.Course;
import school.domain.academics.SchoolClass;

public interface Teachable {
  void teach(Course course, SchoolClass schoolClass);
}
