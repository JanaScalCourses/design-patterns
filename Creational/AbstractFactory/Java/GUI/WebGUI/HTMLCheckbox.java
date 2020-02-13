package GUI.WebGUI;

import GUI.Checkbox;

public class HTMLCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("<checkbox />");
    }

    @Override
    public void onSelect() {
        System.out.println("checked/unchecked");
    }

}