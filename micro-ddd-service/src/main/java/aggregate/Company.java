package aggregate;

import entity.People;
import service.HumanService;
import service.WorkerService;
import vo.WorkCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    private String name;
    private List<People> workers;
    private WorkerService workerService;
    private HumanService humanService;

    public Company(String name) {
        this.name = name;
        this.workers = new ArrayList<>();
        workerService = new WorkerService();
        humanService = new HumanService();
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
            workerService.work(worker);
        }
        System.out.println("worker start to eating");
        for (People worker : this.workers) {
            humanService.eat(worker);
        }
        System.out.println("worker get off work");
        for (People worker : this.workers) {
            workerService.offWork(worker);
        }
        System.out.printf("%s finish work\n", this.name);
    }
}

