package gui;

public class WindownsButton implements Button {

    @Override
    public void render() {
        System.out.println("Draw Windowns Button");
    }

    @Override
    public void onClick() {
        System.out.println("Close Windowns Button");
    }

}
