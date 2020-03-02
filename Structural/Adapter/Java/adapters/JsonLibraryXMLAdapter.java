package adapters;

import data.JSON;
import data.XML;
import entities.JsonLibrary;

public class JsonLibraryXMLAdapter {

  private JsonLibrary jsonLibrary;

  public JsonLibraryXMLAdapter(JsonLibrary jsonLibrary) {
    this.jsonLibrary = jsonLibrary;
  }

  public XML consumeData(XML data) {
    return convert(jsonLibrary.consumeData(convert(data)));
  }

  private JSON convert(XML xml) {
    return new JSON(xml.getContent());
  }

  private XML convert(JSON json) {
    return new XML(json.getContent());
  }
}
