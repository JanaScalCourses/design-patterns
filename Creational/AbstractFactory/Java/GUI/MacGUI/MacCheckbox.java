package GUI.MacGUI;

import GUI.Checkbox;

public class MacCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("Mac checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("checked/unchecked");
    }

}