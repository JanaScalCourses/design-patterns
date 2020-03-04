package facade.videoSubsystem;

public class VideoFile {
  private String content;
  private String extension;

  public VideoFile(String content, String extension) {
    this.content = content;
    this.extension = extension;
  }

  public static VideoFile From(String filename) {
    String[] result = filename.split("[.]");
    if (result.length != 2) {
      throw new RuntimeException("Filename not supported");
    }

    return new VideoFile(result[0], result[1]);
  }

  public String getContent() {
    return content;
  }

  public String getExtension() {
    return extension;
  }

  public String getName() {
    return String.format("%s.%s", content, extension);
  }
}
