package college.Classroom;

import college.Course;
import college.Semester;
import college.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomCourse extends Course {
  private List<ClassroomLesson> lessons = new ArrayList<>();

  public ClassroomCourse(String name, Semester semester, String professor) {
    super(name, semester, professor);
  }

  public void addLesson(ClassroomLesson... lessons) {
    this.lessons.addAll(Arrays.asList(lessons));
  }

  @Override
  public void attend(int lessonIndex, Student student) {
    if (lessonIndex >= 0 && lessonIndex < lessons.size())
      lessons.get(lessonIndex).attendedBy(student);
  }

  @Override
  public boolean wasAttendedBy(int lessonIndex, Student student) {
    if (lessonIndex >= 0 && lessonIndex < lessons.size())
      return lessons.get(lessonIndex).getPresence().contains(student);

    return false;
  }

  @Override
  protected ClassroomCourse clone() throws CloneNotSupportedException {
    return (ClassroomCourse) super.clone();
  }

  @Override
  public ClassroomCourse newSemester() throws CloneNotSupportedException {
    ClassroomCourse clone = (ClassroomCourse) super.newSemester();
    clone.lessons = new ArrayList<>();
    for (ClassroomLesson lesson : this.lessons) {
      clone.lessons.add(lesson.clone().reset());
    }
    return clone;
  }

  @Override
  public void showDetails() {
    super.showDetails();
    System.out.println("Lessons: " + lessons);
  }
}
