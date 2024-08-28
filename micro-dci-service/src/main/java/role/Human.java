package role;

import data.Account;
import data.IdentityCard;
import lombok.AllArgsConstructor;
import lombok.Data;

// Human类
@Data
@AllArgsConstructor
public class Human {

    private IdentityCard identityCard;
    private Account account;

    public void decreaseBalance() {
        int balance = this.account.getBalance();
        account.setBalance(--balance);
    }

    public void increaseBalance() {
        int balance = this.account.getBalance();
        account.setBalance(++balance);
    }

    public void eat() {
        System.out.printf("%s eating\n", identityCard);
        account.decrementBalance();
    }

    public void sleep() {
        System.out.printf("%s sleeping\n", identityCard);
    }

    public void playGame() {
        System.out.printf("%s playing game\n", identityCard);
    }
}
