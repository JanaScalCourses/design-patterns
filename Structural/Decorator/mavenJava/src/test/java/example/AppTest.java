package example;

import junit.framework.TestCase;

public class AppTest
    extends TestCase {
    String message = "Hey there!";
    Notifier notifier = Notifier.getInstance();

    public AppTest(String testName) {
        super(testName);
    }

    public void testNotifier() {
        String expected = String.format("Notifier says: %s", message);
        assertEquals(expected, notifier.send(message));
    }

}
