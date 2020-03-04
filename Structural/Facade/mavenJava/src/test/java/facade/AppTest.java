package facade;

import facade.videoSubsystem.CodecsFactory;
import facade.videoSubsystem.MPEG4CompressionCodecs;
import facade.videoSubsystem.OggCompressionCodecs;
import facade.videoSubsystem.VideoFile;
import junit.framework.TestCase;

import static facade.videoSubsystem.CodecsFactory.Format;


public class AppTest extends TestCase {
    public AppTest(String testName) {
        super(testName);
    }

    public void testVideoFile() {
        VideoFile mp4Video = VideoFile.From("some.mp4");
        VideoFile oggVideo = VideoFile.From("some.ogg");
        assertNotNull(mp4Video);
        assertNotNull(oggVideo);
    }

    public void testCodecFactory() {
        CodecsFactory factory = CodecsFactory.getInstance();
        VideoFile mp4Video = VideoFile.From("some.mp4");
        VideoFile oggVideo = VideoFile.From("some.ogg");
        assertTrue(factory.extract(mp4Video) instanceof MPEG4CompressionCodecs);
        assertTrue(factory.extract(oggVideo) instanceof OggCompressionCodecs);
    }


    public void testApp() {
        VideoConverter converter = new VideoConverter();
        assertEquals("funny-cats-video.mp4", converter.convert("funny-cats-video.ogg", Format.MP4));
    }
}
