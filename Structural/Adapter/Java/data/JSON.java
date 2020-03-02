package data;

public class JSON {
  private String content;

  public JSON(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  @Override
  public String toString() {
    return String.format("{content: %s}", content);
  }
}
