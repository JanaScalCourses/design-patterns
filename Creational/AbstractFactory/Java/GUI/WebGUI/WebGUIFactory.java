package GUI.WebGUI;

import GUI.Button;

public class WebGUIFactory extends GUI.GUIFactory {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }

}