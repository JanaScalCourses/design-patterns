package example;

public abstract class BaseDecorator implements NotifierInterface {
  NotifierInterface notifier;

  public BaseDecorator(NotifierInterface notifier) {
    this.notifier = notifier;
  }

  public String send(String message) {
    return notifier.send(message);
  }
}
