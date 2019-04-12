public class PersonNode {
    
    private String username;
    private String pass;
    private int money;
    private int winCount;
    private int loseCount;

    public PersonNode(String username, String pass, int money) {
        this.username = username;
        this.pass = pass;
        this.money = money;
        this.winCount = 0;
        this.loseCount = 0;
    }

    public String getUsername() {
        return username;
    }

    public int getMoney() {
        return money;
    }

    public int getWinCount() {
        return winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }
}