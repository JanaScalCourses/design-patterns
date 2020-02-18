package college;

public class CourseTest implements Cloneable {
  private String studentName;
  private String className;
  private String date;
  private String questions;
  private String answers;

  public CourseTest(String studentName, String className, String date, String questions) {
    this.studentName = studentName;
    this.className = className;
    this.date = date;
    this.questions = questions;
  }

  public void setAnswers(String answers) {
    this.answers = answers;
  }

  public String getAnswers() {
    return answers;
  }

  @Override
  public String toString() {
    return String.format("%s - %s - %s - %s - %s", studentName, date, className, questions, answers);
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
