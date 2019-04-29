import java.util.ArrayList;
import java.util.List;

/**
 *  THIS STATIC PROGRAM IS THE PSEUDO CODE TO THE USER ACCOUNT AUTHENTICATION
 */


public class ServerStaticPreLobby {
    public static void main(String[] args) {
        List<String> existingPlayer = new ArrayList<>();
        /**
         * ---> CATCH SERVER LOCAL DATA FROM "user_list.txt" <--- (existingPlayer.add(user_list.txt);)
         * if(user.logingIn()) // Click login;
         *      Switch to "Login Scene"
         *     Login(existingPlayer);
         * else if(user.SigningUp()) // Click signup button;
         *      Switch to "Sign up Scene"
         *     Signup(existingPlayer);
         */

    }

    public static void Login(List existingPlayer) {
        /**
         * ---> CATCH CLIENT DATA HERE. CALLING IT client.data() <---
         * if(existingPlayer.contains(client.data.Username) {
         *     ---> GET existingPlayer'S PASSWORD. <--- String password = user.password();
         *     if(password == client.data.Password)
         *         GO TO THE GAME LOBBY;
         *     else
         *         THROW CLIENT MESSAGE "WRONG PASSWORD TRY AGAIN";
         * } else
         *      THROW CLIENT MESSAGE "ACCOUNT DOESN'T EXIST. PROMPT SIGNUP BUTTION"
         */
    }

    public static void SignIp(List existingPlayer) {

    }

    public static void compiler(String in) {

    }
}

class ServerCompiler {
    public static String help() {
        return "/player <username>\n" +
                "/player newaccount <username> <password>\n" +
                "/player deleteaccount <username>\n" +
                "/pause\n" +
                "/resume\n" +
                "/quit\n" +
                "/help";
    }
    public static String invalid() {
        return "Invalid command.";
    }
    public static String pause() {
        return "Game has been pause.";
    }
    public static String resume() {
        return "Game has been resume.";
    }
    public static void say(String text) {
        System.out.println(text + "is said in the chat");
    }
    public static void clear() {
        System.out.println("Chat cleared");
    }
    public static String player(String username) {
        return "Player info is shown.";
    }
    public static String newAccount(String username, String password) {
        return "New player has been created.";
    }
    public static String deleteAccount(String username) {
        return "Account deleted";
    }
}
