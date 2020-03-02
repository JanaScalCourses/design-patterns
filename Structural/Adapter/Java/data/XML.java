package data;

public class XML {
  private String content;

  public XML(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  @Override
  public String toString() {
    return String.format("<content>%s</content>}", content);
  }
}
