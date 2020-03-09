package example;

public class FacebookNotifier extends BaseDecorator {

  public FacebookNotifier(NotifierInterface notifier) {
    super(notifier);
  }

  public String send(String message) {
    String messageSent = String.format("Facebook shared: %s", message);
    System.out.println(messageSent);
    return super.send(message);
  }
}
