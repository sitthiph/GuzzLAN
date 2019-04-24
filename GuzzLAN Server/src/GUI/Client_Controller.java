package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Client_Controller {

    @FXML
    private TextArea prompt;
    @FXML
    private TextField serverInput;
    private String promptText = "";

    public void serverEnter(){
        String text = serverInput.getText();
        promptText = promptText + text + "\n";
        prompt.setText(promptText);
        serverInput.setText("");
    }

}
