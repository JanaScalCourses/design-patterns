import adapters.JsonLibraryXMLAdapter;
import data.JSON;
import data.XML;
import entities.JsonLibrary;

public class Main {

  public static void main(String[] args) {
    JSON jsonData = new JSON("JSON");
    XML xmlData = new XML("XML");

    JsonLibrary library = new JsonLibrary();
    library.consumeData(jsonData);

    JsonLibraryXMLAdapter libraryAdapter = new JsonLibraryXMLAdapter(library);
    libraryAdapter.consumeData(xmlData);
  }
}
