package school.service.course;

import school.domain.people.Teacher;
import school.domain.academics.Course;
import school.domain.davina.Department;
import school.domain.academics.SchoolClass;

import java.util.Scanner;

public class CourseTeacherAssignmentService {
  //  Method to add a teacher
  public static void addTeacher(Department department, Scanner scanner) {
    int id = (int) ((Math.random() * 9000) + 1000);
    System.out.println("Teacher ID: " + id);

    System.out.print("Enter Teacher name: ");
    String teacherName = scanner.nextLine().trim();

    System.out.print("Enter Teacher Age: ");
    String teacherAge = scanner.nextLine().trim();
    int age;

    try {
      age = Integer.parseInt(teacherAge);
    } catch (NumberFormatException e) {
      System.out.println("Invalid age. Operation cancelled.");
      return;
    }

    System.out.print("Enter Teacher Salary: ");
    String teacherSalary = scanner.nextLine().trim();
    double salary;

    try {
      salary = Double.parseDouble(teacherSalary);
    } catch (NumberFormatException e) {
      System.out.println("Invalid salary. Operation cancelled.");
      return;
    }

    Teacher teacher = new Teacher(id, teacherName, age, salary);
    department.addTeacher(teacher);
    System.out.println("Teacher " + teacher.getName() + " added.");
  }

  //  Method to assign course teacher
  public static void assignTeacherToCourse(Department department, Scanner scanner, SchoolClass defaultClass, Teacher teacher) {
    department.addTeacher(teacher);
    
    if (department.getTeachers().isEmpty()) {
      System.out.println("No teachers available.");
      addTeacher(department, scanner);
    }

    if (department.getCourses().isEmpty()) {
      System.out.println("No course available.");
      return;
    }

    System.out.print("Enter name of teacher: ");
    String teacherName = scanner.nextLine().trim();
    Teacher searchTeacher = department.findTeacherByName(teacherName);
    if (searchTeacher == null) {
      System.out.println("Teacher not found.");
      return;
    }

    System.out.print("Enter course code: ");
    String courseCode = scanner.nextLine().trim();
    Course course = department.findCourseByCode(courseCode);
    if (course == null) {
      System.out.println("Course not found.");
      return;
    }

    searchTeacher.addCourse(course);
    searchTeacher.teach(course, defaultClass);
  }
}
