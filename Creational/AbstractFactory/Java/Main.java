import GUI.Button;
import GUI.Checkbox;
import GUI.GUIFactory;
import GUI.WebGUI.WebGUIFactory;
import GUI.WindownsGUI.WinGUIFactory;

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
    factory = new WinGUIFactory();
    test(factory);
  }
}