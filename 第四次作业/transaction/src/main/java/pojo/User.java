package pojo;

public class User {
    private Integer userId;
    private float balance;

    public User() {
    }

    public User(Integer userId, float balance) {
        this.userId = userId;
        this.balance = balance;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
