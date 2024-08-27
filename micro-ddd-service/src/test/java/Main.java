import aggregate.Company;
import aggregate.Home;
import aggregate.Park;
import aggregate.School;
import entity.People;

public class Main {

    public static void main(String[] args) {
        People paul = new People("Paul");

        School mit = new School("MIT");
        Company google = new Company("Google");
        Home home = new Home();
        Park summerPalace = new Park("Summer Palace");

        // 上学
        mit.receive(paul);
        mit.run();

        // 回家
        home.comeBack(paul);
        home.run();

        // 工作
        google.employ(paul);
        google.run();

        // 公园游玩
        summerPalace.welcome(paul);
        summerPalace.run();
    }
}