package college;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private List<CourseTest> tests = new ArrayList<>();
  private String name;
  private Semester semester;
  private String professor;
  private List<Student> students = new ArrayList<>();

  public Course(String name, Semester semester, String professor) {
    this.name = name;
    this.semester = semester;
    this.professor = professor;
  }

  @Override
  public String toString() {

    return String.format("%s %s Prof.: %s", name, semester.toString(), professor);
  }

  public List<Student> getStudents() {
    return students;
  }

  public String getName() {
    return name + " " + semester.toString();
  }

  public void setProfessor(String professor) {
    this.professor = professor;
  }

  public void enroll(Student student) {
    this.students.add(student);
  }

  public void applyTest(int testIndex) {
    students.forEach(student -> {
      try {
        student.resolve(tests.get(testIndex).clone());
      } catch (CloneNotSupportedException e) {
        e.printStackTrace();
      }
    });
  }

  public CourseTest createTest(String questions) {
    CourseTest test = new CourseTest(this, questions);
    tests.add(test);
    return test;
  }


}
