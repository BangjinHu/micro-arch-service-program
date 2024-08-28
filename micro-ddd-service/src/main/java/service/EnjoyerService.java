package service;

import entity.People;

public class EnjoyerService {

    public void buyTicket(People p) {
        System.out.printf("%s buying a ticket\n", p.getIdentityCard());
        p.getAccount().setBalance(p.getAccount().getBalance() - 1);
    }

    public void enjoy(People p) {
        System.out.printf("%s enjoying scenery\n", p.getIdentityCard());
    }
}
