package example;

public class SmsNotifier extends BaseDecorator {

  public SmsNotifier(NotifierInterface notifier) {
    super(notifier);
  }

  public String send(String message) {
    String messageSent = String.format("SMS sent: %s", message);
    System.out.println(messageSent);
    return super.send(message);
  }
}
