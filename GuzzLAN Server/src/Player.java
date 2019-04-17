public class Player {
    
    private String username;
    private String pass;
    private int money;
    private int winCount;
    private int loseCount;

    public PlayerNode(String username, String pass, int money) {
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

    public void setMoney(int money) {
        this.money = money;
    }

    public void setWinCount(int count) {
        this.winCount = count;
    }

    public void setLoseCount(int count) {
        this.loseCount = count;
    }

    public boolean isPass(String pass) {
        return pass.equals(this.pass);
    }

}