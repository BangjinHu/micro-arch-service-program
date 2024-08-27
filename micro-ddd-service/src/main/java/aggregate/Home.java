package aggregate;


import entity.People;

public class Home {

    private People me;

    public Home() {
    }

    public void comeBack(People p) {
        System.out.printf("%s come back home\n", p.getIdentityCard());
        this.me = p;
    }

    public void run() {
        this.me.eat();
        this.me.playGame();
        this.me.sleep();
    }
}