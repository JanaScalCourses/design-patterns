package gui;

public class WindownsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindownsButton();
    }
}
