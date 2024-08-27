package data;

import lombok.Data;

@Data
public class WorkCard {
    private int id;      // Java中使用int类型，因为Java没有uint32
    private String name;
    private String company;

    public WorkCard(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }
}
