package school.domain.davina;

import school.domain.people.Student;
import school.domain.people.Teacher;
import school.domain.academics.Course;
import school.domain.people.Principal;
import school.domain.academics.SchoolClass;
import school.domain.people.NonAcademicStaff;

import java.util.List;
import java.util.ArrayList;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Teacher> getTeachers() {
    return teachers;
  }

  public void setTeachers(List<Teacher> teachers) {
    this.teachers = teachers;
  }

  public Principal getPrincipal() {
    return principal;
  }

  public void setPrincipal(Principal principal) {
    this.principal = principal;
  }

  public List<NonAcademicStaff> getNonAcademicStaffs() {
    return nonAcademicStaffs;
  }

  public void setNonAcademicStaffs(List<NonAcademicStaff> nonAcademicStaffs) {
    this.nonAcademicStaffs = nonAcademicStaffs;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public List<SchoolClass> getClasses() {
    return classes;
  }

  public void setClasses(List<SchoolClass> classes) {
    this.classes = classes;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
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
