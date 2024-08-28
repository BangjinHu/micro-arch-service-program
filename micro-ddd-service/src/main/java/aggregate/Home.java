package aggregate;

import entity.People;
import lombok.NoArgsConstructor;
import service.HumanService;

@NoArgsConstructor
public class Home {

    private People people;
    private HumanService humanService;

    public void comeBack(People p) {
        System.out.printf("%s come back home\n", p.getIdentityCard());
        this.people = p;
        humanService = new HumanService();
    }

    public void run() {
        // 充血模型调用
        // this.people.eat();
        // this.people.playGame();
        // this.people.sleep();
        // 贫血模型调用
        humanService.eat(people);
        humanService.playGame(people);
        humanService.sleep(people);
    }
}