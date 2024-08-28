package service;


import entity.People;

public class HumanService {

    public void eat(People p) {
        System.out.printf("%s eating\n", p.getIdentityCard());
        p.getAccount().setBalance(p.getAccount().getBalance() - 1);
    }

    public void sleep(People p) {
        System.out.printf("%s sleeping\n", p.getIdentityCard());
    }

    public void playGame(People p) {
        System.out.printf("%s playing game\n", p.getIdentityCard());
    }
}