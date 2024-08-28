package data;

import lombok.Data;

@Data
public class IdentityCard {
    private int id;
    private String name;

    public IdentityCard(int id, String name) {
        this.id = id;
        this.name = name;
    }
}