import data.JSON;
import data.XML;

public class Main {

  public static void main(String[] args) {
    JSON jsonData = new JSON("JSON");
    XML xmlData = new XML("XML");

    System.out.println(jsonData);
    System.out.println(xmlData);
  }
}
