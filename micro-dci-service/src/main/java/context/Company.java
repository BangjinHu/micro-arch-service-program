package context;


import data.WorkCard;
import role.impl.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Company {
    private String name;
    private List<Worker> workers;

    public Company(String name) {
        this.name = name;
        this.workers = new ArrayList<>();
    }

    public void employ(Worker worker) {
        WorkCard workCard = new WorkCard(
                (int) UUID.randomUUID().getLeastSignificantBits(),
                worker.castHuman().getIdentityCard().getName(),
                this.name
        );
        worker.setWorkCard(workCard);
        this.workers.add(worker);
        System.out.printf("%s Employ worker %s\n", this.name, worker.getWorkCard().getName());
    }

    public void run() {
        System.out.println(this.name + " start work");
        for (Worker worker : this.workers) {
            worker.work();
        }
        System.out.println("workers start to eating");
        for (Worker worker : this.workers) {
            worker.castHuman().eat();
        }
        System.out.println("workers get off work");
        for (Worker worker : this.workers) {
            worker.offWork();
        }
        System.out.println(this.name + " finish work");
    }
}
