package GUI.MacGUI;

import GUI.Button;
import GUI.Checkbox;

public class MacGUIFactory extends GUI.GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

}