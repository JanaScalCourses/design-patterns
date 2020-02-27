package college.Distance;

import college.Lesson;
import college.Student;

public class DistanceLesson implements Cloneable, Lesson {
  private String content;
  private boolean wasWatched = false;

  public DistanceLesson(String content) {
    this.content = content;
  }

  @Override
  public void attendedBy(Student student) {
    wasWatched = true;
  }

  @Override
  public Lesson reset() {
    wasWatched = false;
    return null;
  }

  @Override
  public String getContent() {
    return content;
  }

  public boolean isWatched() {
    return wasWatched;
  }

  @Override
  public DistanceLesson clone() throws CloneNotSupportedException {
    return (DistanceLesson) super.clone();
  }

  @Override
  public String toString() {
    return content;
  }
}
