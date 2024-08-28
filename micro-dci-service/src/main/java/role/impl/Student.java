package role.impl;

import data.StudentCard;
import lombok.Data;
import role.HumanTrait;

// 学生类
@Data
public class Student {

    private HumanTrait humanTrait;
    private StudentCard studentCard;

    public Student(HumanTrait humanTrait) {
        this.humanTrait = humanTrait;
    }

    public void study() {
        System.out.printf("Student %s studying\n", studentCard.getName());
    }

    public void exam() {
        System.out.printf("Student %s examing\n", studentCard.getName());
    }
}