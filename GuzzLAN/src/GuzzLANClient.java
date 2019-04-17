
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;


import java.io.IOException;

public class GuzzLANClient extends Application {

    public static void main(String[] args) {
        // Establish server connection;

        Thread loginApp = new Thread(() -> launch(args));

        loginApp.start();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent login = FXMLLoader.load(getClass().getResource("LogIn_Scene/Login_Scene.fxml"));
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("GuzzLan");

        primaryStage.setScene(new Scene(login, 720, 480));
        primaryStage.show();
    }
}
