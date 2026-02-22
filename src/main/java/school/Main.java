package school;

import school.people.*;
import school.davina.Department;
import school.academics.SchoolClass;

public class Main {
  public static void main(String[] args) {
//    Demo data
    Principal principal = new Principal(1, "Patrick Okebu", 38, 3000000, 12);
    Department department = new Department("Science", principal);

    Teacher teacher = new Teacher(1, "Sonia Atuchukwu", 30, 150000);

    SchoolClass sss1 = new SchoolClass("SS1A", teacher);
    department.addClass(sss1);

//    runConsole
    RunConsole.runConsole(department, sss1, teacher);
  }
}
