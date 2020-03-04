package facade.videoSubsystem;

import java.util.Optional;

import static facade.videoSubsystem.CodecsFactory.Format.getFormatFromExtension;

public class CodecsFactory {

  private static final CodecsFactory factory = new CodecsFactory();

  public static CodecsFactory getInstance() {
    return factory;
  }

  public enum Format {
    MP4("mp4"), OGG("ogg");
    private String extension;

    Format(String extension) {
      this.extension = extension;
    }

    public String getExtension() {
      return extension;
    }

    public static Optional<Format> getFormatFromExtension(String extension) {
      for (Format format : values()) {
        if (format.getExtension().equals(extension)) {
          return Optional.of(format);
        }
      }
      return Optional.empty();
    }
  }


  public CompressionCodecs extract(VideoFile video) {
    String errorMessage = String.format("Unexpected extension: %s", video.getExtension());
    switch (getFormatFromExtension(video.getExtension()).orElseThrow(() ->
        new IllegalStateException(errorMessage))
    ) {
      case MP4:
        return new MPEG4CompressionCodecs();
      case OGG:
      default:
        return new OggCompressionCodecs();
    }
  }
}
