package GUI.WindownsGUI;

import GUI.Button;
import GUI.Checkbox;

public class WinGUIFactory extends GUI.GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }

}