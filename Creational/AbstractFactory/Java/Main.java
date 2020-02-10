import GUI.Button;
import GUI.Checkbox;
import GUI.GUIFactory;
import GUI.MacGUI.MacGUIFactory;
import GUI.WebGUI.WebGUIFactory;

class Main {
  private static void test(GUIFactory factory) {
    Button button = factory.createButton();
    button.render();
    Checkbox checkbox = factory.createCheckbox();
    checkbox.render();

  }

  public static void main(final String[] args) {
    GUIFactory factory = new WebGUIFactory();
    test(factory);
    factory = new MacGUIFactory();
    test(factory);
  }
}