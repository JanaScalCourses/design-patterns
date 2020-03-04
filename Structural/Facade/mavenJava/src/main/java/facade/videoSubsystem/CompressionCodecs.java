package facade.videoSubsystem;

public abstract class CompressionCodecs {
  CodecsFactory.Format format;

  public CompressionCodecs() {
  }

  public CodecsFactory.Format getFormat() {
    return format;
  }

  public String read(VideoFile videoFile) {
    return videoFile.getContent();
  }

  public VideoFile write(String buffer) {
    return new VideoFile(buffer, this.getFormat().getExtension());
  }
}
