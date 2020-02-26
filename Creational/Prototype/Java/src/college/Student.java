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
    return String.format("%s\n%s", name, courses);
  }
}
