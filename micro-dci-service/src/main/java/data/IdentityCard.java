package data;

import lombok.Data;

@Data
public class IdentityCard {
    private int id;      // Java中使用int类型，因为Java没有uint32
    private String name;

    public IdentityCard(int id, String name) {
        this.id = id;
        this.name = name;
    }
}