package school.domain.davina;

import lombok.Getter;
import lombok.Setter;
import school.domain.people.Student;
import school.domain.people.Teacher;
import school.domain.academics.Course;
import school.domain.people.Principal;
import school.domain.academics.SchoolClass;
import school.domain.people.NonAcademicStaff;

import java.util.List;
import java.util.ArrayList;

@Setter
@Getter
public class Department {
  String name;
  Principal principal;

  List<Teacher> teachers = new ArrayList<>();
  List<NonAcademicStaff> nonAcademicStaffs = new ArrayList<>();
  List<Student> students = new ArrayList<>();
  List<SchoolClass> classes = new ArrayList<>();
  List<Course> courses = new ArrayList<>();

  public Department(String name, Principal principal) {
    this.name = name;
    this.principal = principal;
  }

  public void addTeacher(Teacher teacher) {
    if (!teachers.contains(teacher)) {
      teachers.add(teacher);
    }
  }

  public void addStudent(Student student) {
    if (!students.contains(student)) {
      students.add(student);
    }
  }

  public void addNonAcademicStaff(NonAcademicStaff staff) {
    if (!nonAcademicStaffs.contains(staff)) {
      nonAcademicStaffs.add(staff);
    }
  }

  public void addClass(SchoolClass schoolClass) {
    if (!classes.contains(schoolClass)) {
      classes.add(schoolClass);
    }
  }

  public void addCourse(Course course) {
    if (!courses.contains(course)) {
      courses.add(course);
    }
  }

  public void removeStudent(Student student) {
    students.remove(student);
  }

//  Helper methods
  public Student findStudentByName(String name) {
    return students.stream()
      .filter(s -> s.getName().equalsIgnoreCase(name))
      .findFirst()
      .orElse(null);
  }

  public Course findCourseByCode(String code) {
    return courses.stream()
      .filter(c -> c.getCode().equalsIgnoreCase(code))
      .findFirst()
      .orElse(null);
  }

  public Teacher findTeacherByName(String name) {
    return teachers.stream()
        .filter(t -> t.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElse(null);
  }
}
