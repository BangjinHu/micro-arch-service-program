package entity;


import lombok.Data;
import vo.Account;
import vo.IdentityCard;
import vo.StudentCard;
import vo.WorkCard;

import java.util.Random;

@Data
public class People {

    private IdentityCard identityCard;
    private StudentCard studentCard;
    private WorkCard workCard;
    private Account account;

    public People(String name) {
        this.identityCard = new IdentityCard();
        this.identityCard.setId((new Random()).nextInt());
        this.identityCard.setName(name);

        this.account = new Account();
        this.account.setId((new Random()).nextInt());
        this.account.setBalance(10);
    }

    //充血模型，所有的方法都集中在一起，此类蜕变成上帝类
    //    public void study() {
    //        System.out.printf("Student %s studying\n", this.studentCard);
    //    }
    //
    //    public void exam() {
    //        System.out.printf("Student %s examing\n", this.studentCard);
    //    }
    //    public void eat() {
    //        System.out.printf("%s eating\n", this.identityCard);
    //        this.account.setBalance(this.account.getBalance() - 1);
    //    }
    //
    //    public void sleep() {
    //        System.out.printf("%s sleeping\n", this.identityCard);
    //    }
    //
    //    public void playGame() {
    //        System.out.printf("%s playing game\n", this.identityCard);
    //    }
    //
    //    public void work() {
    //        System.out.printf("%s working\n", this.workCard);
    //        this.account.setBalance(this.account.getBalance() + 1);
    //    }
    //
    //    public void offWork() {
    //        System.out.printf("%s getting off work\n", this.workCard);
    //    }
    //
    //    public void buyTicket() {
    //        System.out.printf("%s buying a ticket\n", this.identityCard);
    //        this.account.setBalance(this.account.getBalance() - 1);
    //    }
    //
    //    public void enjoy() {
    //        System.out.printf("%s enjoying scenery\n", this.identityCard);
    //    }
}
