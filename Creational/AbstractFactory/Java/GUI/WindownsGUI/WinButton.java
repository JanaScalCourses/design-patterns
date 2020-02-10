package GUI.WindownsGUI;
import GUI.Button;

public class WinButton implements Button {

    @Override
    public void render() {
        System.out.println("Windowns button");
    }

    @Override
    public void onClick() {
        System.out.println("Close Windowns Button");
    }

}
