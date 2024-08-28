package role;

import role.impl.Human;

public interface HumanTrait {
    Human castHuman(); // 假设方法，用于返回Human对象

    void decreaseBalance(); // 假设方法，用于减少余额

    void increaseBalance();// 假设方法，用于增加余额
}