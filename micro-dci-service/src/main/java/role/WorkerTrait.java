package role;

import role.impl.Human;
import role.impl.Worker;

// 假设的接口，对应Go中的WorkerTrait
public interface WorkerTrait {
    Worker castWorker();

    Human castHuman();
}