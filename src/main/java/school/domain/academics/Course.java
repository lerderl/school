package school.domain.academics;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Course {
  String code;
  String title;
  int units;

  public Course(String code, String title, int units) {
    this.code = code;
    this.title = title;
    this.units = units;
  }

  //  @Override
  public String toString() {
    return code + " - " + title + " (" + units + " units)";
  }

}
