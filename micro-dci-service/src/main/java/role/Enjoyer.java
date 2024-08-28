package role;

import lombok.Data;

// 游玩者类
@Data
public class Enjoyer {

    private Human human;

    public Enjoyer(Human human) {
        this.human = human;
    }

    public void buyTicket() {
        System.out.printf("%s buying a ticket\n", human.getIdentityCard().getName());
        human.decreaseBalance();
    }

    public void enjoy() {
        System.out.printf("%s enjoying scenery\n", human.getIdentityCard().getName());
    }

}
