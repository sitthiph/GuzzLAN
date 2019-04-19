import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class GuzzLAN_Server extends Application {

    Button button;

    public static void main(String[] args) {
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket socket = serverSocket.accept();
        DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
        DataInputStream inputFromClient = new DataInputStream(socket.getInputStream()); 

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GuzzLAN_Server");
        button = new Button("Click Here for Free Porn");

        button.setOnAction(e -> System.out.println("LAMDAAA LE TSGO"));
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
