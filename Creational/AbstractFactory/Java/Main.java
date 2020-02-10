import GUI.Button;
import GUI.GUIFactory;
import GUI.WebGUI.WebGUIFactory;
import GUI.WindownsGUI.WinGUIFactory;

class Main {
  public static void main(final String[] args) {
    GUIFactory factory = new WebGUIFactory();
    Button button = factory.createButton();
    button.render();
    button.onClick();

    factory = new WinGUIFactory();
    button = factory.createButton();
    button.render();
    button.onClick();
  }
}