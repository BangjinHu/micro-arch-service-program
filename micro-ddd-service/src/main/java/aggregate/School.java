package aggregate;


import entity.People;
import vo.StudentCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class School {
    private String name;
    private List<People> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void receive(People student) {
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
            student.study();
        }
        System.out.println("students start to eating");
        for (People student : this.students) {
            student.eat();
        }
        System.out.println("students start to exam");
        for (People student : this.students) {
            student.exam();
        }
        System.out.printf("%s finish class\n", this.name);
    }
}