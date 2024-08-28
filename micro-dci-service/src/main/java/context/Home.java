package context;


import lombok.Data;
import role.impl.Human;

@Data
public class Home {

    private Human human;

    public void comeBack(Human human) {
        System.out.printf("%s come back home\n", human.getIdentityCard().getName());
        this.human = human;
    }

    public void run() {
        if (this.human != null) {
            this.human.eat();
            this.human.playGame();
            this.human.sleep();
        } else {
            System.out.println("No human in the home to perform actions.");
        }
    }
}