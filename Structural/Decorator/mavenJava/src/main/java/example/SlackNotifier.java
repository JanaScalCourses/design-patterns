package example;

public class SlackNotifier extends BaseDecorator {

  public SlackNotifier(NotifierInterface notifier) {
    super(notifier);
  }

  public String send(String message) {
    String messageSent = String.format("Slack message sent: %s", message);
    System.out.println(messageSent);
    return super.send(message);
  }
}
