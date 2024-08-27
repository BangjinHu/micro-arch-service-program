package role.impl;

import data.StudentCard;
import lombok.Data;
import role.HumanTrait;
import role.StudentTrait;

// 学生类
@Data
public class Student implements StudentTrait {
    private HumanTrait humanTrait;
    private StudentCard studentCard;

    public Student(HumanTrait humanTrait) {
        this.humanTrait = humanTrait;
    }

    public Student(HumanTrait humanTrait, StudentCard studentCard) {
        this.humanTrait = humanTrait;
        this.studentCard = studentCard;
    }

    @Override
    public Student castStudent() {
        return this;
    }

    @Override
    public Human castHuman() {
        return this.humanTrait.castHuman();
    }

    public void study() {
        System.out.printf("Student %s studying\n", studentCard.getName());
    }

    public void exam() {
        System.out.printf("Student %s examing\n", studentCard.getName());
    }
}