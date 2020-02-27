package college;

import college.Classroom.ClassroomCourse;
import college.Classroom.ClassroomLesson;
import college.Distance.DistanceCourse;
import college.Distance.DistanceLesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class College {
  private static void enroll(Course course, Student student) {
    course.enroll(student);
    student.enrollAt(course);
  }

  public static void main(String[] args) {
    Map<Semester, List<Course>> coursesPerSemester = new HashMap<>();
    List<Course> courses = new ArrayList<>();
    Semester semester = Semester.create(2020, 1);
    coursesPerSemester.put(semester, courses);

    Student jana = new Student("Janaina");

    ClassroomCourse classroomCourse = new ClassroomCourse("Design Patterns", semester, "Isaac");
    courses.add(classroomCourse);
    classroomCourse.addLesson(new ClassroomLesson("Design Patterns content"));
    classroomCourse.createTest("some question");

    DistanceCourse distanceCourse = new DistanceCourse("Java", semester, "Google");
    courses.add(distanceCourse);
    distanceCourse.addLesson(new DistanceLesson("Java content"));
    distanceCourse.createTest("some project");

    courses.forEach(course -> {
      enroll(course, jana);
      course.attend(0, jana);
      course.applyTest(0);
    });

    jana.showDetails();

    try {
      courses = new ArrayList<>();
      for (Course course : coursesPerSemester.get(semester)) {
        courses.add(course.newSemester());
      }
      Semester nextSemester = courses.get(0).getSemester();
      coursesPerSemester.put(nextSemester, courses);

      coursesPerSemester.forEach((sem, cours) -> {
        System.out.println("\n-------------- New Semester --------------\n");
        for (Course course : cours) {
          course.showDetails();
          System.out.println();
        }
      });

    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

  }
}
