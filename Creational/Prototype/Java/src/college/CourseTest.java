package college;

public class CourseTest implements Cloneable {
  private String studentName;
  private Course course;
  private String date;
  private String questions;
  private String answers;

  public CourseTest(Course course, String questions) {
    this.course = course;
    this.questions = questions;
  }

  public CourseTest(CourseTest clone) {
    this.studentName = clone.studentName;
    this.course = clone.course;
    this.date = clone.date;
    this.questions = clone.questions;
    this.answers = clone.questions;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public void setAnswers(String answers) {
    this.answers = answers;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public void setQuestions(String questions) {
    this.questions = questions;
  }

  public String getQuestions() {
    return questions;
  }

  public Course getCourse() {
    return course;
  }

  public String getAnswers() {
    return answers;
  }

  public void resolveBy(Student student, String date, String answers) {
    this.studentName = student.getName();
    setDate(date);
    setAnswers(answers);
  }

  @Override
  public String toString() {
    return String.format("%s - %s - %s", studentName, date, course.getName());
  }

  @Override
  public CourseTest clone() throws CloneNotSupportedException {
    super.clone();
    return new CourseTest(this);
  }
}
