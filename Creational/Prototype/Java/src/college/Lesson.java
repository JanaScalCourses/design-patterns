package college;

public interface Lesson {
  void attendedBy(Student student);

  Lesson reset();

  String getContent();
}