package facade;

import facade.videoSubsystem.*;

public class VideoConverter {


  public String convert(String filename, CodecsFactory.Format format) {
    VideoFile video = VideoFile.From(filename);
    CompressionCodecs sourceCodecs = CodecsFactory.getInstance().extract(video);

    CompressionCodecs destinationCodecs;
    if (format.equals(CodecsFactory.Format.MP4)) {
      destinationCodecs = new MPEG4CompressionCodecs();
    } else {
      destinationCodecs = new OggCompressionCodecs();
    }

    String buffer = BitrateReader.read(filename, sourceCodecs);
    VideoFile result = BitrateReader.convert(buffer, destinationCodecs);
    return result.getName();
  }
}