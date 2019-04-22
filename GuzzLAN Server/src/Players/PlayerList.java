public class PlayerList {
    private PlayerListNode head, tail;

    public PlayerList() {
        head = null;
        tail = head;
    }

    public void add(PlayerListNode player) {
        if (head == null) {
            head = player;
            head.next = head;
            tail = head;
            return;
        }
    }

    public PlayerListNode remove(int index) {
        if (index >= size()) {
            throw new IllegalArgumentException("Index Exceeds Size!!!");
        }

        PlayerListNode current = head;
        PlayerListNode previous = null;
        int i = 0;
        while (current != tail && i != index) {
            previous = current;
            current = current.next;
            i++;
        }

        previous = current.next;
        return null;
    }

    public PlayerListNode get(int index) {
        if (index >= size()) {
            throw new IllegalArgumentException("Index Exceeds Size!!!");
        }

        PlayerListNode current = head;
        int i = 0;
        while (current != tail && i != index) {
            current.previous = current.previous.next.next;
            i++;
        }

        return current;
    }

    public int size() {
        if (head == null) {
            return 0;
        }

        int count = 1;
        PlayerListNode current = head;

        while (current != tail) {
            current = current.next;
            count++;
        }

        return count;
    }

    public void clear() {
        head = null;
        tail = head;
    }

    public boolean isEmpty() {
        return !((head == null) && (tail == head));
    }
}