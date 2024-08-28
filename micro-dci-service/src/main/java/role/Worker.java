package role;

import data.WorkCard;
import lombok.Data;

@Data
public class Worker {

    private Human human;
    private WorkCard workCard;

    public Worker(Human human) {
        this.human = human;
    }

    public void work() {
        System.out.printf("%s working\n", workCard.getName());
        human.increaseBalance();
    }

    public void offWork() {
        System.out.printf("%s getting off work\n", workCard.getName());
    }
}