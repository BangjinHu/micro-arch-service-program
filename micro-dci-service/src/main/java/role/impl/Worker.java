package role.impl;

import data.WorkCard;
import lombok.Data;
import role.HumanTrait;

@Data
public class Worker {

    private HumanTrait humanTrait;
    private WorkCard workCard;

    public Worker(HumanTrait humanTrait) {
        this.humanTrait = humanTrait;
    }
    
    public void work() {
        System.out.printf("%s working\n", workCard.getName());
        humanTrait.increaseBalance();
    }

    public void offWork() {
        System.out.printf("%s getting off work\n", workCard.getName());
    }
}