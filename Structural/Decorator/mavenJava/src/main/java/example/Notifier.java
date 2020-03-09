package example;

public class Notifier implements NotifierInterface {

  private static Notifier instance = new Notifier();

  public static Notifier getInstance() {
    return instance;
  }

  public String send(String message) {
    String messageSent = String.format("Notifier says: %s", message);
    System.out.println(messageSent);
    return messageSent;
  }
}
