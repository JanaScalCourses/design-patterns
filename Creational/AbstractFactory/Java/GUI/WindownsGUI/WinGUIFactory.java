package GUI.WindownsGUI;

import GUI.Button;

public class WinGUIFactory extends GUI.GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

}