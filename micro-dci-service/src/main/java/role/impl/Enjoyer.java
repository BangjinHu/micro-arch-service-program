package role.impl;

import lombok.Data;
import role.EnjoyerTrait;
import role.HumanTrait;

// 游玩者类
@Data
public class Enjoyer implements EnjoyerTrait {
    private HumanTrait humanTrait;

    public Enjoyer(HumanTrait humanTrait) {
        this.humanTrait = humanTrait;
    }

    @Override
    public Enjoyer castEnjoyer() {
        return this;
    }

    @Override
    public Human castHuman() {
        return humanTrait.castHuman();
    }

    public void buyTicket() {
        System.out.printf("%s buying a ticket\n", humanTrait.castHuman().getIdentityCard().getName());
        humanTrait.decreaseBalance();
    }

    public void enjoy() {
        System.out.printf("%s enjoying scenery\n", humanTrait.castHuman().getIdentityCard().getName());
    }

}
