package school.service.admission;

import school.domain.davina.Department;
import school.domain.academics.SchoolClass;

import java.util.Scanner;

public interface AdmitApplicantService {
  void admitStudentApplicant(Department department, SchoolClass defaultClass, Scanner scanner);
}
