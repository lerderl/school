package school.service.course;

import school.domain.people.Student;
import school.domain.academics.Course;
import school.domain.davina.Department;

import java.util.Scanner;

public class StudentCourseEnrollmentService {
  public static void enrollStudentInCourse(Department department, Scanner scanner) {
    if (department.getStudents().isEmpty()) {
      System.out.println("No Students available. Admit a student first.");
      return;
    }

    if (department.getCourses().isEmpty()) {
      System.out.println("No course available. Add a course.");
      return;
    }

    System.out.print("Enter student name: ");
    String studentName = scanner.nextLine().trim();
    Student student = department.findStudentByName(studentName);
    if (student == null) {
      System.out.println("Student not found.");
      return;
    }

    System.out.print("Enter course code: ");
    String courseCode = scanner.nextLine().trim();
    Course course = department.findCourseByCode(courseCode);
    if (course == null) {
      System.out.println("Course not found.");
      return;
    }

    student.enroll(course);
  }
}
