package entities;

import adapters.JsonLibraryXMLAdapter;
import data.XML;

public class CoreClasses {
  private XML currentData;
  private JsonLibraryXMLAdapter xmlLibrary;

  public CoreClasses(JsonLibraryXMLAdapter xmlLibrary) {
    this.xmlLibrary = xmlLibrary;
  }

  public XML getCurrentData() {
    return currentData;
  }

  private void setCurrentData(XML currentData) {
    this.currentData = currentData;
  }

  public void receiveData(XML data) {
    setCurrentData(data);
  }

  public XML processData(XML data) {
    return xmlLibrary.consumeData(data);
  }
}
