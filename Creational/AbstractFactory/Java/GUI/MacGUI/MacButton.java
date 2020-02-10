package GUI.MacGUI;
import GUI.Button;

public class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Mac button");
    }

    @Override
    public void onClick() {
        System.out.println("Close Mac Button");
    }

}
