import gui.Button;
import gui.Dialog;
import gui.WebDialog;

class Main {
    public static void main(String[] args) {
        Dialog dialog = new WebDialog();
        dialog.render();
        Button b = dialog.createButton();
        b.onClick();
    }
}