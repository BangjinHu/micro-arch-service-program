package context;

import role.impl.Enjoyer;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Enjoyer> enjoyers;

    public Park(String name) {
        this.name = name;
        this.enjoyers = new ArrayList<>();
    }

    public void welcome(Enjoyer enjoyer) {
        System.out.printf("%s comes to park %s\n", enjoyer.castHuman().getIdentityCard(), this.name);
        this.enjoyers.add(enjoyer);
    }

    public void run() {
        System.out.println(this.name + " start to sell tickets");
        for (Enjoyer enjoyer : this.enjoyers) {
            enjoyer.buyTicket();
        }
        System.out.println(this.name + " start a show");
        for (Enjoyer enjoyer : this.enjoyers) {
            enjoyer.enjoy();
        }
        System.out.println("show finish");
    }
}