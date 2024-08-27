package data;

import lombok.Data;

// Account类，对应Go中的Account结构体
@Data
public class Account {
    private int id;
    private int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public void decrementBalance() {
        this.balance--;
    }
}
