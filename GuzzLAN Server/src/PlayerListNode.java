public class PlayerListNode {
    private Player data;
    private PlayerListNode previous;
    private PlayerListNode next;

    public PlayerListNode() {
        this(null);
    }

    public PlayerListNode(Player data) {
        this(data, null, null);
    }

    public PlayerListNode(Player data, PlayerListNode previous, PlayerListNode next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    public Player getData() {
        return data;
    }

    public PlayerListNode getPrevious() {
        return previous;
    }

    public PlayerListNode getNext() {
        return next;
    }

    public void setData(Player data) {
        this.data = data;
    }

    public void setPrevious(PlayerListNode previous) {
        this.previous = previous
    }

    public void setNext(PlayerListNode next) {
        this.next = next;
    }
}