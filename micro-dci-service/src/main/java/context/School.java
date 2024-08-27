package context;

import data.StudentCard;
import role.impl.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void receive(Student student) {
        StudentCard studentCard = new StudentCard(
                (int) UUID.randomUUID().getLeastSignificantBits(),
                student.castHuman().getIdentityCard().getName(),
                this.name
        );
        student.setStudentCard(studentCard);
        this.students.add(student);
        System.out.printf("%s Receive student %s\n", this.name, studentCard);
    }

    public void run() {
        System.out.println(this.name + " start class");
        for (Student student : this.students) {
            student.study();
        }
        System.out.println("students start to eating");
        for (Student student : this.students) {
            student.castHuman().eat();
        }
        System.out.println("students start to exam");
        for (Student student : this.students) {
            student.exam();
        }
        System.out.println(this.name + " finish class");
    }
}
