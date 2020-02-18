package college;

public class College {
  public static void main(String[] args) throws CloneNotSupportedException {
    CourseTest t = new CourseTest("jana", "design-patterns", "today", "some questions");
    CourseTest courseTest = (CourseTest) t.clone();
    t.setAnswers("Don't know.");
    System.out.println(t);
    System.out.println(courseTest);
  }
}
