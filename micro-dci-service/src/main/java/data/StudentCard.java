package data;

import lombok.Data;

@Data
public class StudentCard {
    private int id;      // Java中使用int类型，因为Java没有uint32
    private String name;
    private String school;

    public StudentCard(int id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

}

