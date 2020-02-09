import gui.Button;
import gui.Dialog;
import gui.WindownsDialog;

class Main {
    public static void main(String[] args) {
        Dialog dialog = new WindownsDialog();
        dialog.render();
        Button b = dialog.createButton();
        b.onClick();
    }
}