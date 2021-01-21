package Game;

import java.util.concurrent.ThreadLocalRandom;

public class Random {
    static int randomGenerator() {
        return ThreadLocalRandom.current().nextInt(50);
    }
}
