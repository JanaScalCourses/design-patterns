package college.Distance;

import college.Course;
import college.Semester;
import college.Student;

import java.util.*;

public class DistanceCourse extends Course {
  private List<DistanceLesson> availableLessons = new ArrayList<>();
  private Map<Student, List<DistanceLesson>> lessons = new HashMap<>();

  public DistanceCourse(String name, Semester semester, String professor) {
    super(name, semester, professor);
  }

  @Override
  public void enroll(Student student) {
    super.enroll(student);
    List<DistanceLesson> studentLessons = new ArrayList<>();
    for (DistanceLesson lesson : availableLessons) {
      try {
        studentLessons.add(lesson.clone());
      } catch (CloneNotSupportedException e) {
        e.printStackTrace();
      }
    }
    lessons.put(student, studentLessons);
  }

  public void addLesson(DistanceLesson... lessons) {
    this.availableLessons.addAll(Arrays.asList(lessons));
    this.lessons.forEach((student, studentLessons) -> {
      for (DistanceLesson lesson : lessons) {
        try {
          studentLessons.add(lesson.clone());
        } catch (CloneNotSupportedException e) {
          e.printStackTrace();
        }
      }
    });
  }

  @Override
  public void attend(int lessonIndex, Student student) {
    if (lessons.get(student) != null && lessonIndex >= 0 && lessonIndex < lessons.get(student).size()) {
      lessons.get(student).get(lessonIndex).attendedBy(student);
    }
  }

  @Override
  public boolean wasAttendedBy(int lessonIndex, Student student) {
    if (lessons.get(student) != null && lessonIndex >= 0 && lessonIndex < lessons.get(student).size()) {
      return lessons.get(student).get(lessonIndex).isWatched();
    }
    return false;
  }

  @Override
  public void showDetails() {
    super.showDetails();
    System.out.println("Lessons: " + availableLessons);
  }

  @Override
  protected DistanceCourse clone() throws CloneNotSupportedException {
    return (DistanceCourse) super.clone();
  }

  @Override
  public DistanceCourse newSemester() throws CloneNotSupportedException {
    DistanceCourse clone = (DistanceCourse) super.newSemester();
    clone.lessons = new HashMap<>();
    clone.availableLessons = new ArrayList<>();
    for (DistanceLesson lesson : this.availableLessons) {
      clone.availableLessons.add(lesson.clone());
    }
    return clone;
  }
}
