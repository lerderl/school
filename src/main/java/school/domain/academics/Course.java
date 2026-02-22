package school.domain.academics;

public class Course {
  String code;
  String title;
  int units;

  public Course(String code, String title, int units) {
    this.code = code;
    this.title = title;
    this.units = units;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getUnits() {
    return units;
  }

  public void setUnits(int units) {
    this.units = units;
  }

//  @Override
  public String toString() {
    return code + " - " + title + " (" + units + " units)";
  }

}
