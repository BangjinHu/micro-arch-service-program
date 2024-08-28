package data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentCard {
    private int id;
    private String name;
    private String school;
}

