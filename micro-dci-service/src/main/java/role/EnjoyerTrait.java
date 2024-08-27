package role;

import role.impl.Enjoyer;
import role.impl.Human;

public interface EnjoyerTrait {
    Enjoyer castEnjoyer();

    Human castHuman();
}
