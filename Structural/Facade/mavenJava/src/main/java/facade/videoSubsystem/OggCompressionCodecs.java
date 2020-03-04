package facade.videoSubsystem;

public class OggCompressionCodecs extends CompressionCodecs {

  public OggCompressionCodecs() {
    super();
    this.format = CodecsFactory.Format.OGG;
  }
}
