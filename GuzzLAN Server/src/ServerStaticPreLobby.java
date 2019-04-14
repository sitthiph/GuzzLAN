import java.util.ArrayList;
import java.util.List;

/**
 *  THIS STATIC PROGRAM IS THE PSEUDO CODE TO THE USER ACCOUNT AUTHENTICATION
 */


public class ServerStaticPreLobby {
    public static void main(String[] args) {
        List<String> existingPlayer = new ArrayList<>();
        /**
         * ---> CATCH SERVER LOCAL DATA FROM "user_list.txt" <--- (lobby.add(user_list.txt);)
         * if(user.logingIn())
         *     Login(existingPlayer);
         * else if(user.SigningUp())
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
}
