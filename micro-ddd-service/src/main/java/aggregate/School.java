package aggregate;

import entity.People;
import service.HumanService;
import service.StudentService;
import vo.StudentCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class School {
    private String name;
    private List<People> students;
    private StudentService studentService;
    private HumanService humanService;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        studentService = new StudentService();
        humanService = new HumanService();
    }

    public void enterSchool(People student) {
        StudentCard studentCard = new StudentCard();
        studentCard.setId((new Random()).nextInt());
        studentCard.setName(student.getIdentityCard().getName());
        studentCard.setSchool(this.name);
        student.setStudentCard(studentCard);
        this.students.add(student);
        System.out.printf("%s Receive stduent \n", this.name, studentCard);
    }

    public void run() {
        System.out.printf("%s start class\n", this.name);
        for (People student : this.students) {
            studentService.study(student);
        }
        System.out.println("students start to eating");
        for (People student : this.students) {
            humanService.eat(student);
        }
        System.out.println("students start to exam");
        for (People student : this.students) {
            studentService.exam(student);
        }
        System.out.printf("%s finish class\n", this.name);
    }
}