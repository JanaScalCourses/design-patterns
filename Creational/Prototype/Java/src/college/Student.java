package college;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

  private String name;
  private Map<Course, List<CourseTest>> courses = new HashMap<>();

  public Student(String name) {
    this.name = name;
  }

  public List<Course> getCourses() {
    return new ArrayList<>(courses.keySet());
  }

  public List<CourseTest> getTestsBy(Course course) {
    return courses.get(course);
  }

  public List<CourseTest> getAllTests() {
    List<CourseTest> list = new ArrayList<>();
    courses.forEach((course, courseTests) -> list.addAll(courseTests));
    return list;
  }

  public String getName() {
    return name;
  }

  public void enrollAt(Course course) {
    this.courses.put(course, new ArrayList<>());
  }

  public void resolve(CourseTest courseTest) {
    courseTest.resolveBy(this, "today", "some answers");
    courses.get(courseTest.getCourse()).add(courseTest);
  }

  @Override
  public String toString() {
    return name;
  }

  public void showDetails() {
    System.out.println("Student: " + name);
    courses.forEach((course, tests) -> {
      System.out.println("\tCourse: " + course);
      for (CourseTest test : tests) {
        System.out.println("\t\t" + test);
      }
    });
  }
}
