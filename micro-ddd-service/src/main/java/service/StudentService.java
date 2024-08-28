package service;

import entity.People;

public class StudentService {

    public void study(People p) {
        System.out.printf("Student %s studying\n", p.getStudentCard());
    }

    public void exam(People p) {
        System.out.printf("Student %s examing\n", p.getStudentCard());
    }
}