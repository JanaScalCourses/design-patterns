package college;

public class College {
  private static void enroll(Course course, Student student) {
    course.enroll(student);
    student.enrollAt(course);
  }

  public static void main(String[] args) {
    Course course = new Course("Design Patterns", Semester.create(2020, 1), "Isaac");
    System.out.println("Course: " + course);

    System.out.println("_______________\nBefore enroll students");
    System.out.println(course.getStudents());
    enroll(course, new Student("Janaina"));
    System.out.println("_______________\nAfter enroll students");
    System.out.println(course.getStudents());

    course.createTest("some question");
    System.out.println("_______________\nApply Test");
    course.applyTest(0);
    for (Student student : course.getStudents()) {
      student.showDetails();
    }
  }
}
