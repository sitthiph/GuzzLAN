import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class GuzzLAN_Server {


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        Socket socket = serverSocket.accept();
        DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
        DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
    }
}
