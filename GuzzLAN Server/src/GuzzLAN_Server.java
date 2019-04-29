import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


@SuppressWarnings("Duplicates")
public class GuzzLAN_Server extends Application {


    public static void main(String[] args) throws IOException {
        Thread loginApp = new Thread(() -> launch(args));
        loginApp.start();

        //ServerSocket serverSocket = new ServerSocket(8000);
        //Socket socket = serverSocket.accept();
        //DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
        //DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());

    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent login = FXMLLoader.load(getClass().getResource("GUI/Client_Server.fxml"));
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("GuzzLan");

        primaryStage.setScene(new Scene(login, 720, 480));
        primaryStage.show();
    }
}
