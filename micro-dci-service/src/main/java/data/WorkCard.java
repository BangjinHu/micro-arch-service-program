package data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkCard {
    private int id;
    private String name;
    private String company;
}
