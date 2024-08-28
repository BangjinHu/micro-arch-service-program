package service;

import entity.People;

public class WorkerService {

    public void work(People p) {
        System.out.printf("%s working\n", p.getWorkCard());
        p.getAccount().setBalance(p.getAccount().getBalance() + 1);
    }

    public void offWork(People p) {
        System.out.printf("%s getting off work\n", p.getWorkCard());
    }
}