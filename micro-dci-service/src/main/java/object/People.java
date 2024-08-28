package object;

import data.Account;
import data.IdentityCard;
import role.Enjoyer;
import role.Human;
import role.Student;
import role.Worker;

public class People {
    private Human human;
    private Student student;
    private Worker worker;
    private Enjoyer enjoyer;

    public People(String name) {
        // 初始化Human角色
        this.human = new Human(new IdentityCard((int) (Math.random() * Integer.MAX_VALUE), name),
                new Account((int) (Math.random() * Integer.MAX_VALUE), 10));
        // 初始化Student、Worker和Enjoyer角色，并设置Human作为基础
        this.student = new Student(this.human);
        this.worker = new Worker(this.human);
        this.enjoyer = new Enjoyer(this.human);
    }

    public Human castHuman() {
        return this.human;
    }

    public Student castStudent() {
        return this.student;
    }

    public Worker castWorker() {
        return this.worker;
    }

    public Enjoyer castEnjoyer() {
        return this.enjoyer;
    }
}