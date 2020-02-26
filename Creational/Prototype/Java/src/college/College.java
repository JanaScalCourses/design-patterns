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
    course.getStudents().forEach(System.out::println);
    enroll(course, new Student("Janaina"));
    course.createTest("some question");
    System.out.println("_______________\nAfter enroll students");
    course.getStudents().forEach(System.out::println);
    System.out.println("_______________\nApply Test");
    course.applyTest(0);
    course.getStudents().forEach(System.out::println);
  }
}
