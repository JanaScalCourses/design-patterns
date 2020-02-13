package GUI.WindownsGUI;

import GUI.Checkbox;

public class WinCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Windows checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("checked/unchecked");
    }

}