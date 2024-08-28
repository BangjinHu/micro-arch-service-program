import context.Company;
import context.Home;
import context.Park;
import context.School;
import object.People;

public class Main {

    public static void main(String[] args) {
        // entity
        People paul = new People("Paul");
        // aggregate
        School mit = new School("MIT");
        Company google = new Company("Google");
        Home home = new Home();
        Park summerPalace = new Park("Summer Palace");

        // 上学
        mit.enterSchool(paul.castStudent());
        mit.run();

        // 回家
        home.comeBack(paul.castHuman());
        home.run();

        // 工作
        google.employ(paul.castWorker());
        google.run();

        // 公园游玩
        summerPalace.welcome(paul.castEnjoyer());
        summerPalace.run();
    }
}