package GUI.WebGUI;

import GUI.Button;
import GUI.Checkbox;

public class WebGUIFactory extends GUI.GUIFactory {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new HTMLCheckbox();
    }

}