import java.util.LinkedList;
import java.util.List;

public class PlayerList {
    private List<PlayerListNode> playerList;

    public PlayerList() {
        this.playerList = new LinkedList<PlayerListNode>();
    }

    public void add(PlayerListNode player) {
        playerList.add(player);
    }

    public void add(int index, PlayerListNode player) {
        playerList.add(index, player);
    }

    public PlayerListNode remove(int i) {
        return playerList.remove(i);
    }

    public PlayerListNode get(int index) {
        return playerList.get(index);
    }

    public void clear() {
        playerList.clear();
    }

    public boolean isEmpty() {
        return playerList.isEmpty();
    }
}
