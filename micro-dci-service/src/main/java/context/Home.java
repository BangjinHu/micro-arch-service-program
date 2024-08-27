package context;


import role.impl.Human;

public class Home {
    private Human me;

    public Home() {
        // 构造函数
    }

    public void comeBack(Human human) {
        System.out.printf("%s come back home\n", human.getIdentityCard());
        this.me = human;
    }

    public void run() {
        if (this.me != null) {
            this.me.eat();
            this.me.playGame();
            this.me.sleep();
        } else {
            System.out.println("No human in the home to perform actions.");
        }
    }
}