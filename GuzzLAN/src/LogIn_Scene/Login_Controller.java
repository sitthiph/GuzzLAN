package LogIn_Scene;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import staticData.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Login_Controller {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button logInButton;
    @FXML
    private Button SignupBotton;

    public void changeScene(javafx.event.ActionEvent event) throws IOException {
        Parent inGame = FXMLLoader.load(getClass().getClassLoader().getResource("inGame/inGame.fxml"));
        Scene inGameScene = new Scene(inGame);

        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(inGameScene);
        window.show();
    }
}