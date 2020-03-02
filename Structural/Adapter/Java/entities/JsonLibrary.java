package entities;

import data.JSON;

public class JsonLibrary {

  public JSON consumeData(JSON data) {
    System.out.println(data);
    return new JSON("return value");
  }
}
