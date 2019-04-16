package LogIn_Scene;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login_Controller {
    public TextField username;
    public PasswordField password;
    public Button logInButton;
    public Button SignupBotton;

    public void consumeInfo() {
        String user = username.getText();
        String pass = password.getText();
    }
}
