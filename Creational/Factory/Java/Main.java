import gui.Button;
import gui.Dialog;

class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        Button b = dialog.createButton();
        b.onClick();
    }
}