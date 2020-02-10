package gui;

public class WebDialog extends Dialog{
    @Override
    public void render() {
        System.out.println("Draw HTML Dialog");
    }
    
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
