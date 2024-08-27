package service;


import entity.People;

public class HumanService {

    public void eat(People p) {
        System.out.printf("%+v eating\n", p.getIdentityCard());
        p.getAccount().setBalance(p.getAccount().getBalance() - 1);
    }

    public void sleep(People p) {
        System.out.printf("%+v sleeping\n", p.getIdentityCard());
    }

    public void playGame(People p) {
        System.out.printf("%+v playing game\n", p.getIdentityCard());
    }
}