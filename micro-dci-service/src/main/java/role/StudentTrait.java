package role;

import role.impl.Human;
import role.impl.Student;

// 学生角色特征接口
public interface StudentTrait {
    Student castStudent();

    Human castHuman();
}