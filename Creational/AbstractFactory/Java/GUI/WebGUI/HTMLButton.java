package GUI.WebGUI;
import GUI.Button;

public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("<button />");
    }

    @Override
    public void onClick() {
        System.out.println("Close HTML Button");
    }

}
