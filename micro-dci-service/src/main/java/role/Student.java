package role;

import data.StudentCard;
import lombok.Data;

// 学生类
@Data
public class Student {

    private Human human;
    private StudentCard studentCard;

    public Student(Human human) {
        this.human = human;
    }

    public void study() {
        System.out.printf("Student %s studying\n", studentCard.getName());
    }

    public void exam() {
        System.out.printf("Student %s examing\n", studentCard.getName());
    }
}