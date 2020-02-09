package gui;

public class Dialog {

    public void render(){
        System.out.println("Create Dialog");
    }

    public Button createButton(){
        return new DefaultButton();
    }
}
