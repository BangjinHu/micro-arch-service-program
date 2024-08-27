package role.impl;

import data.WorkCard;
import lombok.Data;
import role.HumanTrait;
import role.WorkerTrait;

@Data
public class Worker implements WorkerTrait {
    private HumanTrait humanTrait;
    private WorkCard workCard;

    public Worker(HumanTrait humanTrait) {
        this.humanTrait = humanTrait;
    }

    public Worker(HumanTrait humanTrait, WorkCard workCard) {
        this.humanTrait = humanTrait;
        this.workCard = workCard;
    }

    @Override
    public Worker castWorker() {
        return this;
    }

    @Override
    public Human castHuman() {
        return this.getHumanTrait().castHuman();
    }

    public void work() {
        System.out.printf("%s working\n", workCard.getName());
        humanTrait.increaseBalance();
    }

    public void offWork() {
        System.out.printf("%s getting off work\n", workCard.getName());
    }
}