package college;

public class Semester {
  private Integer year;
  private Integer semester;

  private Semester(Integer year, Integer semester) {
    this.year = year;
    this.semester = semester;
  }

  static Semester create(Integer year, Integer semester) {
    if (year < 1900 || year > 2100)
      throw new RuntimeException("year out of range");
    if (semester < 1 || semester > 2)
      throw new RuntimeException("semester out of range");
    return new Semester(year, semester);
  }

  Semester next() {
    if (semester == 2)
      return new Semester(year + 1, 1);
    else
      return new Semester(year, 2);
  }

  @Override
  public String toString() {
    return String.format("%d/%d", year, semester);
  }
}