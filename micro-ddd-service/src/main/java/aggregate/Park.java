package aggregate;

import entity.People;
import service.EnjoyerService;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<People> enjoyers;
    private EnjoyerService enjoyerService;

    public Park(String name) {
        this.name = name;
        this.enjoyers = new ArrayList<>();
        enjoyerService = new EnjoyerService();
    }

    public void welcome(People enjoyer) {
        System.out.printf("%s come to park %s\n", enjoyer.getIdentityCard(), this.name);
        this.enjoyers.add(enjoyer);
    }

    public void run() {
        System.out.printf("%s start to sell tickets\n", this.name);
        for (People enjoyer : this.enjoyers) {
            enjoyerService.buyTicket(enjoyer);
        }
        System.out.printf("%s start a show\n", this.name);
        for (People enjoyer : this.enjoyers) {
            enjoyerService.enjoy(enjoyer);
        }
        System.out.println("show finish");
    }
}