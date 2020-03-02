package college.Classroom;

import college.Lesson;
import college.Student;

import java.util.HashSet;
import java.util.Set;

public class ClassroomLesson implements Cloneable, Lesson {
  private String content;
  private Set<Student> presence = new HashSet<>();

  public ClassroomLesson(String content) {
    this.content = content;
  }

  public Set<Student> getPresence() {
    return presence;
  }

  @Override
  public String getContent() {
    return content;
  }

  @Override
  public void attendedBy(Student student) {
    presence.add(student);
  }

  @Override
  public ClassroomLesson reset() {
    presence.clear();
    return this;
  }

  @Override
  protected ClassroomLesson clone() throws CloneNotSupportedException {
    return (ClassroomLesson) super.clone();
  }

  @Override
  public String toString() {
    return String.format("%s - %s", content, presence);
  }
}
