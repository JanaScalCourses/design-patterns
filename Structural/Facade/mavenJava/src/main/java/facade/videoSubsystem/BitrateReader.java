package facade.videoSubsystem;

public class BitrateReader {

  public static String read(String filename, CompressionCodecs codecs) {
    VideoFile videoFile = VideoFile.From(filename);
    return codecs.read(videoFile);


  }

  public static VideoFile convert(String buffer, CompressionCodecs destinationCodecs) {

    return destinationCodecs.write(buffer);
  }
}
