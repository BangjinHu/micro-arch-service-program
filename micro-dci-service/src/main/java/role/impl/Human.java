package role.impl;

import data.Account;
import data.IdentityCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import role.HumanTrait;

// Human类
@Data
@AllArgsConstructor
public class Human implements HumanTrait {

    private IdentityCard identityCard;
    private Account account;

    @Override
    public Human castHuman() {
        return this;
    }

    @Override
    public void decreaseBalance() {
        int balance = this.account.getBalance();
        account.setBalance(--balance);
    }

    @Override
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
