package facade.videoSubsystem;

public class MPEG4CompressionCodecs extends CompressionCodecs {

  public MPEG4CompressionCodecs() {
    super();
    this.format = CodecsFactory.Format.MP4;
  }
}
