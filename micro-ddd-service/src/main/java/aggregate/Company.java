package aggregate;

import entity.People;
import vo.WorkCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    private String name;
    private List<People> workers;

    public Company(String name) {
        this.name = name;
        this.workers = new ArrayList<>();
    }

    public void employ(People worker) {
        WorkCard workCard = new WorkCard();
        workCard.setId((new Random()).nextInt());
        workCard.setName(worker.getIdentityCard().getName());
        workCard.setCompany(this.name);

        worker.setWorkCard(workCard);

        this.workers.add(worker);

        System.out.printf("%s Employ worker %s\n", this.name, worker.getWorkCard().getName());
    }

    public void run() {
        System.out.printf("%s start work\n", this.name);

        for (People worker : this.workers) {
            worker.work();
        }

        System.out.println("worker start to eating");

        for (People worker : this.workers) {
            worker.eat();
        }

        System.out.println("worker get off work");

        for (People worker : this.workers) {
            worker.offWork();
        }

        System.out.printf("%s finish work\n", this.name);
    }
}

