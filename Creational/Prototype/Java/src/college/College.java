package college;

import college.Classroom.ClassroomCourse;
import college.Classroom.ClassroomLesson;
import college.Distance.DistanceCourse;
import college.Distance.DistanceLesson;

public class College {
  private static void enroll(Course course, Student student) {
    course.enroll(student);
    student.enrollAt(course);
  }

  public static void main(String[] args) {
    Semester semester = Semester.create(2020, 1);
    Student jana = new Student("Janaina");

    ClassroomCourse classroomCourse = new ClassroomCourse("Design Patterns", semester, "Isaac");
    ClassroomLesson classroomLesson = new ClassroomLesson("Design Patterns content");
    classroomCourse.addLesson(classroomLesson);
    classroomCourse.createTest("some question");

    DistanceCourse distanceCourse = new DistanceCourse("Java", semester, "Google");
    DistanceLesson distanceLesson = new DistanceLesson("Java content");
    distanceCourse.addLesson(distanceLesson);
    distanceCourse.createTest("some project");

    enroll(classroomCourse, jana);
    classroomCourse.attend(0, jana);
    enroll(distanceCourse, jana);
    distanceCourse.attend(0, jana);

    classroomCourse.applyTest(0);
    distanceCourse.applyTest(0);

    jana.showDetails();
    System.out.println();
    classroomCourse.showDetails();
    System.out.println();
    distanceCourse.showDetails();

    System.out.println("\n-------------- New Semester --------------\n");
    try {
      DistanceCourse newDistanceCurse = distanceCourse.newSemester();
      newDistanceCurse.showDetails();
      System.out.println();
      ClassroomCourse newClassroomCourse = classroomCourse.newSemester();
      newClassroomCourse.showDetails();

    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

  }
}
